import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {

    private int numberId;
    private int capacity;
    private int puntajeAC;
    private Aircraft[] AvionesEnElPorta;
    private Marine[] marines;
    private Navy navy;
    private Location location;

    public AircraftCarrier(int numberId, int puntajeAC, Location location, Navy navy) {
        this.numberId = numberId;
        this.capacity = capacity;
        this.puntajeAC = puntajeAC;
        AvionesEnElPorta= new Aircraft[6];
        marines = new Marine[5];
        this.location = location;
        this.navy = navy;


    }

    public Location getLocation() {
        return location;
    }

    public Marine[] getMarines() {
        return marines;
    }

    public Aircraft[] getAvionesEnElPorta() {
        return AvionesEnElPorta;
    }

    public boolean addAircraft(AircraftCarrier aircraftCarrier, Aircraft aircraft)
    {
        boolean Exist = false,result=false;
        int x=0;
        if(aircraft.isInAir() == false) {
            for (int i = 0; i < marines.length && !Exist; i++) {
                aircraftCarrier.getAvionesEnElPorta()[i] = null;
                Exist = true;
                x = i;
            }
            if (Exist) {
                aircraftCarrier.getAvionesEnElPorta()[x] = aircraft;
                result = true;
            }
        }
        return result;
    }
    public int espaciosdisponibles()
    {
        int x=0;

        for (int i = 0; i < marines.length; i++) {
                AvionesEnElPorta[i] = null;
                x++;
        }
        return x;
    }
    public boolean addMarine(AircraftCarrier aircraftCarrier, Marine marine)
    {
        boolean Exist = false,result=false;
        int x=0;
        if(navy.getNumOfMarines() > 0) {
            if (marine.isEnUso() == false) {
                for (int i = 0; i < marines.length && !Exist; i++) {
                    aircraftCarrier.getMarines()[i] = null;
                    Exist = true;
                    x = i;
                }
                if (Exist) {
                    marine.isEnUsoCambiar();
                    aircraftCarrier.getMarines()[x] = marine;
                    result = true;
                }
            }
        }
        return result;
    }




}
