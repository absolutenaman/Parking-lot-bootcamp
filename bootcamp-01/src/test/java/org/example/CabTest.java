package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CabTest {

    @Test
    public void calculate2kmFare() {
        Cab cab = new Cab(4, 0);
        Assertions.assertEquals(40, cab.fare());
    }

    @Test
    public void calculate2kmFareWithWaitTime() {
        Cab cab = new Cab(4, 5);
        Assertions.assertEquals(50, cab.fare());
    }

    @Test
    public void calculateMinimumFair() {
        Cab cab = new Cab(1, 0);
        Assertions.assertEquals(40, cab.fare());
    }

    @Test
    public void calculateAggregate() {
        Cab[] cab = new Cab[2];
        cab[0] = new Cab(4,1);
        cab[1] = new Cab(4,2);
        CabRides rides = new CabRides(cab);
        Assertions.assertEquals(43, rides.calculateAggregate());
    }

    @Test
    public void calculateInvoice() {
        CabInvoice invoice = new CabInvoice();
    }
}
