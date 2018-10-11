package airports.repository;

import java.nio.file.Path;

public class RepositoryConfiguration {

  public Path countryFilePath() { return Path.of("./repository/src/main/resources/countries.csv"); }

  public Path airportFilePath() { return Path.of("./repository/src/main/resources/airports.csv"); }

  public Path runwayFilePath() { return Path.of("./repository/src/main/resources/runways.csv"); }

}
