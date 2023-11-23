import org.junit.jupiter.api.Assertions;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabridesTest {
   Cabrides cabrides=new Cabrides();

    CabRide one =new CabRide(10,2);
    CabRide two =new CabRide(11,0);
    CabRide three =new CabRide(4,22);

    Cabrides cabridesFare=new Cabrides().add(one).add(two).add(three);

 @Test
 void cabFareSholdbe150() {
  int aggreagteFare = cabrides.aggregateFare();
  assertEquals(150, aggreagteFare);
 }

}
