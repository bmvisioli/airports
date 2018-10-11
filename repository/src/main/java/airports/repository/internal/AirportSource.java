package airports.repository.internal;

import airports.repository.RepositoryConfiguration;
import airports.repository.domain.BaseAirport;
import java.nio.file.Path;

public class AirportSource extends CsvSource<BaseAirport> {

  public AirportSource(RepositoryConfiguration configuration) {
    super(configuration);
  }

  @Override
  protected Path getPath() {
    return configuration.airportFilePath();
  }

  @Override
  protected BaseAirport extract(String[] split) {
    return new BaseAirport(Integer.valueOf(split[0]), split[3], split[8]);
  }

}
