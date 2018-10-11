package airports.repository.domain;

public class BaseCountry {

  private String code;
  private String name;

  public BaseCountry(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "BaseCountry{" +
        "code='" + code + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
