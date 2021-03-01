import java.util.ArrayList;
import java.util.List;


public class Navy {
    private String name;
    public final String code;
    private Board board;
    private List<Aircraft> AircraftInWater;
    private Aircraft aircraft;
    private List<Ship> ShipInWater;
    private List<AircraftCarrier> AircraftCarrierInWater;
    private List<Location> location;
    private ArrayList<String> Placasenaire;
    private int NumOfMarines;



    public Navy(String name, String code1, int NumOfMarines) {
        this.name = name;
        this.code = code1;
        ShipInWater = new ArrayList<>();
        AircraftInWater = new ArrayList<>();
        AircraftCarrierInWater = new ArrayList<>();
        location = new ArrayList<>();
        this.NumOfMarines = NumOfMarines;
        Placasenaire = new ArrayList<>();

    }

    public List<Ship> getShipInWater() {
        return ShipInWater;
    }

    public List<Aircraft> getAircraftInWater() {
        return AircraftInWater;
    }
    public List<AircraftCarrier> getAircraftCarrierInWater()
    {
        return AircraftCarrierInWater;
    }

    public int getNumOfMarines() {
        return NumOfMarines;
    }
    public int RestNumOfMarines() {
        return NumOfMarines --;
    }

    public List<Location> getLocation() {
        return location;
    }

    /**
     * Agrega los barcos validos a la lista de barcos en el agua
     *
     *
     */
    public boolean setShips(Ship ship)
    {
        boolean exist = false;
        boolean result = false;
        if(ship.getLocation().getLongitude() >= -100 && ship.getLocation().getLongitude() <= 100 && ship.getLocation().getLatitude() >= -100 && ship.getLocation().getLatitude() <= 100)
        {
            if (ShipInWater.contains(ship)) {
                exist = true;
            }
            if (!exist) {

                ShipInWater.add(ship);
                result=true;
                location.add(ship.getLocation());



            }
        }
        return result;


    }
    /**
     * Agrega las aeronaves validos a la lista de aeronaves en el agua
     *
     *
     */
    public boolean setAircraft(Aircraft aircraft)
    {
        boolean exist = false;
        boolean result = false;
        if(NumOfMarines >= 0) {
            if (aircraft.getLocation().getLongitude() >= -100 && aircraft.getLocation().getLongitude() <= 100 && aircraft.getLocation().getLatitude() >= -100 && aircraft.getLocation().getLatitude() <= 100) {
                if (AircraftInWater.contains(aircraft)) {
                    exist = true;
                }
                if (!exist) {
                    if (aircraft.getPilot().getRange() == "pilot" || aircraft.getPilot().getRange() == "Pilot" || aircraft.getPilot().getRange() == "Piloto" || aircraft.getPilot().getRange() == "piloto") {
                        if (aircraft.getCopilot().getRange() == "copilot" || aircraft.getCopilot().getRange() == "Copilot" || aircraft.getCopilot().getRange() == "Copiloto" || aircraft.getCopilot().getRange() == "copiloto") {
                            AircraftInWater.add(aircraft);
                            result = true;
                            location.add(aircraft.getLocation());

                        }
                    }
                }
            }
        }
        return result;



    }
    /**
     * Agrega los portaaviones validos a la lista de portaviones en el agua
     *
     *
     */
    public boolean setAircraftCarrier(AircraftCarrier aircraftCarrier)
    {
        boolean exist = false;
        boolean result = false;
        if(aircraftCarrier.getLocation().getLongitude() >= -100 && aircraftCarrier.getLocation().getLongitude() <= 100 && aircraftCarrier.getLocation().getLatitude() >= -100 && aircraftCarrier.getLocation().getLatitude() <= 100)
        {
            if (AircraftCarrierInWater.contains(aircraftCarrier)) {
                exist = true;
            }
            if (!exist) {

                AircraftCarrierInWater.add(aircraftCarrier);
                result=true;
                location.add(aircraftCarrier.getLocation());

            }
        }
        return result;

    }
    /**
     * obtiene las licencias de las aeronaves y las guarda en una lista
     *
     *
     */

    public ArrayList<String> getPlacasenaire(Navy navy) {

        for (int i=0;i<AircraftInWater.size();i++)
        {
            if(AircraftInWater.get(i).getNavy() == navy)
            {
                if(AircraftInWater.get(i).isInAir())
                {
                    Placasenaire.add(AircraftInWater.get(i).getLicencePlate());
                }

            }
        }

        return Placasenaire;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o){

        //verify not null
        if(o == null){
            return false;
        }

        //Object instance of Student
        if(!(o instanceof Navy)){
            return false;
        }

        //casteo
        Navy navy = (Navy)o;

        // Validation
        return this.name == navy.getCode();
    }

}
