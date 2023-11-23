import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabRideTest {


  @Test
  void cabRideCostShouldBe40If3KmTravelled() {
    CabRide cabRide = new CabRide(3,
        0);  // given
    int cost = cabRide.fare();  // when
    Assertions.assertEquals(40, cost );  // then
  }

  @Test
  void cabRideCostShouldBE40If4KmTravelled() {
    CabRide cabRide = new CabRide(4,
        0);
    Assertions.assertEquals(40, cabRide.fare());
  }

  @Test
  void cabRideCostShouldBe40With5MinsWait() {
    CabRide cabRide = new CabRide(0, 5);
    Assertions.assertEquals(40, cabRide.fare());
  }
  @Test
  void cabRideCostShouldBe110With10KmTravelledWith5MinsWaitTime() {
    CabRide cabRide = new CabRide(10, 5);
    Assertions.assertEquals(110, cabRide.fare());
  }
  @Test
    void cabRideWith(){
    int[][] cabRides = {{3,6}, {10,5}, {5, 2}};
    CabRide cabRide = new CabRide(10, 5);
  }
}
