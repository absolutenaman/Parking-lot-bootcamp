package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CabRides {
    private final Cab[] rides;

    public CabRides(Cab[] cab) {
        rides = cab;
    }


    public int calculateAggregate() {
        int totalFare =0;
        for (Cab ride : rides) {
            totalFare = totalFare + ride.fare();
        }
        return totalFare / rides.length;
    }
}