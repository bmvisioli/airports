package airports.repository.internal;

import airports.repository.RepositoryConfiguration;
import airports.repository.domain.BaseCountry;
import java.nio.file.Path;

public class CountrySource extends CsvSource<BaseCountry> {

  public CountrySource(RepositoryConfiguration configuration) {
    super(configuration);
  }

  @Override
  protected Path getPath() {
    return configuration.countryFilePath();
  }

  @Override
  protected BaseCountry extract(String[] split) {
    return new BaseCountry(split[1], split[2]);
  }

}
