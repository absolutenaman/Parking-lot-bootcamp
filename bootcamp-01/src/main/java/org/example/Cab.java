package org.example;

public class Cab {
    private static final int DISTANCE_FARE_PER_KM = 10;
    private static final int WAIT_FARE_PER_MINUTE = 2;
    private static final int MINIMUM_FARE = 40;
    private final int distanceTravelled;
    private final int waitTime;


    public Cab(int distanceTravelled, int waitTime) {
        this.distanceTravelled = distanceTravelled;
        this.waitTime = waitTime;
    }


    public int fare() {
        int fare = DISTANCE_FARE_PER_KM * distanceTravelled + WAIT_FARE_PER_MINUTE * waitTime;
        return Math.max(fare, MINIMUM_FARE);
    }
}
