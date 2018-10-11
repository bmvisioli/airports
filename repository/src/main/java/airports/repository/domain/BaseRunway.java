package airports.repository.domain;

public class BaseRunway {

  private int id;
  private int airportCode;
  private String surface;
  private String leIdent;

  public BaseRunway(int id, int airportCode, String surface, String leIdent) {
    this.id = id;
    this.surface = surface;
    this.airportCode = airportCode;
    this.leIdent = leIdent;
  }

  public int getId() {
    return id;
  }

  public String getSurface() {
    return surface;
  }

  public int getAirportCode() {
    return airportCode;
  }

  public String getLeIdent() {
    return leIdent;
  }

  @Override
  public String toString() {
    return "BaseRunway{" +
        "id=" + id +
        ", airportCode=" + airportCode +
        ", surface='" + surface + '\'' +
        ", leIdent='" + leIdent + '\'' +
        '}';
  }
}
