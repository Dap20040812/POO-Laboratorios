import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String licencePlate;
    private boolean inAir;
    private int pointsA;
    private List<Marine> pilot;
    private boolean NeedCopilot;
    private List<Marine> copilot;


    public Aircraft(String licencePlate, boolean inAir, int pointsA, Location location, boolean NeedCopilot) {
        this.licencePlate = licencePlate;
        this.inAir = inAir;
        this.pointsA = pointsA;
        this.NeedCopilot = NeedCopilot;
        pilot = new ArrayList<>();
        copilot = new ArrayList<>();
        createPilot();
        if(NeedCopilot)
        {
            createCoPilot();
        }


    }
    /**
     * Crea los pilotos
     *
     *
     */
    public void createPilot()
    {
        int i=0;
        Marine pilot1 = new Marine("Daniel"+i, "Pilot");
        i++;
        pilot.add(pilot1);

    }
    /**
     * Crea los copilotos
     *
     *
     */
    public void createCoPilot()
    {
        int i=0;
        Marine copilot1 = new Marine("Jose"+i, "Copilot");
        i++;
        copilot.add(copilot1);

    }

    public boolean isInAir() {
        return inAir;
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
        return this.inAir == aircraft.isInAir();
    }



}
