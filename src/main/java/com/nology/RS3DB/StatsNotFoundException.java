package com.nology.RS3DB;

public class StatsNotFoundException extends RuntimeException {
    public StatsNotFoundException() {
        super("No gear/stats found.");
    }
}
