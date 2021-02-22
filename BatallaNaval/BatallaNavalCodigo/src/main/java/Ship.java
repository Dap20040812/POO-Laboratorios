import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int numberId;
    private int puntajeS;
    private Marine marines;
    private int NeededMarinesS;

    public Ship(int numberId, int puntajeS, int NeededMarinesS, Location location,Navy navy) {
        this.numberId = numberId;
        this.puntajeS = puntajeS;
        this.NeededMarinesS = NeededMarinesS;
        createMarines();


    }
    /**
     * Crea los marinos
     *
     *
     */
    public void createMarines()
    {
        for (int i=0; i < NeededMarinesS; i++)
        {
            Marine marine = new Marine("Juan"+i, "marine");
        }
    }

    public int getNumberId() {
        return numberId;
    }

    @Override
    public boolean equals(Object o){

        //verify not null
        if(o == null){
            return false;
        }

        //Object instance of Student
        if(!(o instanceof Ship)){
            return false;
        }

        //casteo
        Ship ship = (Ship)o;

        // Validation
        return this.numberId == ship.getNumberId();
    }





}
