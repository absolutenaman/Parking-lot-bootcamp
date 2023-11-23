public class CabRide {
  public static final int FARE_PER_KM = 10;
  public static final int FARE_PER_WAIT_MINUTE = 2;
  private final int distanceTravelled;
  private final int waitTimeInMinutes;

  public CabRide(int distanceTravelled,
                 int waitTimeInMinutes) {
    this.distanceTravelled = distanceTravelled;
    this.waitTimeInMinutes = waitTimeInMinutes;
  }

  public int fare() {
    int fare=distanceTravelled * FARE_PER_KM + waitTimeInMinutes * FARE_PER_WAIT_MINUTE;
    if(fare <40)
      return 40;
    else
      return fare;
  }

}
