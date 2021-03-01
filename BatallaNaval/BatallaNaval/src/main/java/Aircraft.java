import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String licencePlate;
    private boolean inAir;
    private int pointsA;
    private Navy navy;
    private Location location;
    private Marine pilot;
    private Marine copilot;


    public Aircraft(String licencePlate, boolean inAir, int pointsA, Location location,Navy navy,Marine pilot,Marine copilot) {
        this.licencePlate = licencePlate;
        this.inAir = inAir;
        this.pointsA = pointsA;
        this.navy= navy;
        this.location = location;
        this.pilot = pilot;
        this.copilot = copilot;
        navy.RestNumOfMarines();
        navy.getNumOfMarines();

    }



    public boolean isInAir() {

        return inAir;
    }

    public Marine getPilot() {
        return pilot;
    }

    public Marine getCopilot() {
        return copilot;
    }

    public Location getLocation() {
        return location;
    }

    public Navy getNavy() {
        return navy;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    @Override
    public boolean equals(Object o){

        //verify not null
        if(o == null){
            return false;
        }

        //Object instance of Student
        if(!(o instanceof Aircraft)){
            return false;
        }

        //casteo
        Aircraft aircraft = (Aircraft) o;

        // Validation
        return this.licencePlate == aircraft.getLicencePlate() || this.location == aircraft.location;
    }



}
