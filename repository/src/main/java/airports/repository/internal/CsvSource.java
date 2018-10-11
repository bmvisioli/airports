package airports.repository.internal;

import airports.repository.RepositoryConfiguration;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class CsvSource<E> {

  protected RepositoryConfiguration configuration;

  protected abstract Path getPath();

  protected abstract E extract(String[] split);

  public CsvSource(RepositoryConfiguration configuration) {
    this.configuration = configuration;
  }

  public List<E> read() {
    return doRead(getPath(), l -> parseLine(l, this::extract));
  }

  private List<E> doRead(Path path, Function<String, Optional<E>> parser) {
    try (var stream = Files.lines(path)) {

      return stream.skip(1).map(parser).flatMap(Optional::stream).collect(Collectors.toList());

    } catch (IOException e) {
      System.err.println("You messed up the files, man...");
    }
    return List.of();
  }

  private Optional<E> parseLine(String line, Function<String[], E> extract) {
    try {
      return Optional.of(extract.apply(line.split(",")));
    } catch (Exception err) {
      System.err.println("Found a faulty line [" + line + "]");
    }
    return Optional.empty();
  }
}
