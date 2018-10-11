package airports.repository.domain;

public class BaseAirport {

  private int id;
  private String name;
  private String countryCode;

  public BaseAirport(int id, String name, String countryCode) {
    this.name = name;
    this.countryCode = countryCode;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "BaseAirport{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", countryCode='" + countryCode + '\'' +
        '}';
  }
}
