package dev.lpa;

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description){

        var today = new java.util.Date();

        System.out.println(today + " : " + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on "
//        + getClass().getSimpleName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

};

interface Trackable {

    void track();
};

public abstract class Animal {

    public abstract void move();
}
