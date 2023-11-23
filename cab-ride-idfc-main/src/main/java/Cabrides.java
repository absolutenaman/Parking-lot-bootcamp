import java.util.*;
public class Cabrides {
    private final ArrayList<CabRide> cabRideList;

    public Cabrides() {
       this.cabRideList = new ArrayList<>();
   }
   public Cabrides add(CabRide cabride)
   {
       cabRideList.add(cabride);
       return this;
   }

    public int aggregateFare() {
       int totalfare= 0;
       for(CabRide cabRide : cabRideList) {
           totalfare+=cabRide.fare();
       }
       return  totalfare;
   }

}
