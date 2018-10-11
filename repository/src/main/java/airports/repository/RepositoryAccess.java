package airports.repository;

import airports.repository.domain.BaseAirport;
import airports.repository.domain.BaseCountry;
import airports.repository.domain.BaseFlight;
import airports.repository.domain.BaseRunway;
import airports.repository.internal.AirportSource;
import airports.repository.internal.CountrySource;
import airports.repository.internal.RunwaySource;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepositoryAccess {

  private AirportSource airportSource;
  private RunwaySource runwaySource;
  private CountrySource countrySource;

  public RepositoryAccess() {
    this(new RepositoryConfiguration());
  }

  public RepositoryAccess(RepositoryConfiguration configuration) {
    this.airportSource = new AirportSource(configuration);
    this.runwaySource = new RunwaySource(configuration);
    this.countrySource = new CountrySource(configuration);
  }

  public CompletableFuture<List<BaseCountry>> getAllCountries() {
    return CompletableFuture.supplyAsync(countrySource::read);
  }

  public CompletableFuture<List<BaseAirport>> getAllAirports() {
    return CompletableFuture.supplyAsync(airportSource::read);
  }

  public CompletableFuture<List<BaseRunway>> getAllRunways() {
    return CompletableFuture.supplyAsync(runwaySource::read);
  }

  public CompletableFuture<List<BaseFlight>> getFlighsForAirport(BaseAirport airport, int limit) {
    return CompletableFuture.completedFuture(
        IntStream.range(0, limit)
            .boxed()
            .map(i -> new BaseFlight(airport.getCountryCode()))
           .collect(Collectors.toList()));
  }

}
