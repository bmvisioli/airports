package airports.repository.domain;

import java.time.LocalDateTime;
import java.util.Random;

public class BaseFlight {

  private static final Random RANDOM = new Random();

  private int id;
  private String airport;
  private LocalDateTime expectedLandingTime;
  private LocalDateTime actualLandingTime;

  public BaseFlight(String airport) {

    this.id = RANDOM.nextInt();
    this.airport = airport;
    this.expectedLandingTime = LocalDateTime.now().minusMinutes(RANDOM.nextInt(10));
    this.actualLandingTime = expectedLandingTime.plusMinutes(RANDOM.nextInt(10));
  }

  public BaseFlight(int id, String airport, LocalDateTime expectedLandingTime, LocalDateTime actualLandingTime) {
    this.id = id;
    this.airport = airport;
    this.expectedLandingTime = expectedLandingTime;
    this.actualLandingTime = actualLandingTime;
  }

  public int getId() {
    return id;
  }

  public String getAirport() {
    return airport;
  }

  public LocalDateTime getExpectedLandingTime() {
    return expectedLandingTime;
  }

  public LocalDateTime getActualLandingTime() {
    return actualLandingTime;
  }

  @Override
  public String toString() {
    return "BaseFlight{" +
        "id=" + id +
        ", airport='" + airport + '\'' +
        ", expectedLandingTime=" + expectedLandingTime +
        ", actualLandingTime=" + actualLandingTime +
        '}';
  }
}
