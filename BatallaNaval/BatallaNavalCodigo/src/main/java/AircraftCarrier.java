import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {

    private int numberId;
    private int capacity;
    private int puntajeAC;
    private int NeededMarinesAC;

    public AircraftCarrier(int numberId, int capacity, int puntajeAC,int NeededMarinesAC, Location location) {
        this.numberId = numberId;
        this.capacity = capacity;
        this.puntajeAC = puntajeAC;
        this.NeededMarinesAC = NeededMarinesAC;
        createMarines();


    }
    /**
     * Crea los marinos
     *
     *
     */
    public void createMarines()
    {
        for (int i=0; i < NeededMarinesAC; i++)
        {
            Marine marine = new Marine("Pedro"+i, "marine");
        }
    }

}
