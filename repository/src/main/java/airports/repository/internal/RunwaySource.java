package airports.repository.internal;

import airports.repository.RepositoryConfiguration;
import airports.repository.domain.BaseRunway;
import java.nio.file.Path;

public class RunwaySource extends CsvSource<BaseRunway> {

  public RunwaySource(RepositoryConfiguration configuration) {
    super(configuration);
  }

  @Override
  protected Path getPath() {
    return configuration.runwayFilePath();
  }

  @Override
  protected BaseRunway extract(String[] split) {
    return new BaseRunway(Integer.valueOf(split[0]), Integer.valueOf(split[1]), split[5], split[8]);
  }

}
