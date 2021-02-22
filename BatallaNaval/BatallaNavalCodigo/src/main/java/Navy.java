import java.util.ArrayList;
import java.util.List;


public class Navy {
    private String name;
    public final String code;
    private Board board;
    private List<Aircraft> AircraftInWater;
    private List<Ship> ShipInWater;
    private List<AircraftCarrier> AircraftCarrierInWater;
    private List<Location> location;
    private int NumOfShips;
    private int NumOfAircraftCarriers;
    private ArrayList<String> Placasenaire;

    public Navy(String name, String code1, int NumOfShips, int NumOfAircraftCarriers) {
        this.name = name;
        this.code = code1;
        this.NumOfShips = NumOfShips;
        this.NumOfAircraftCarriers = NumOfAircraftCarriers;
        ShipInWater = new ArrayList<>();
        AircraftInWater = new ArrayList<>();
        AircraftCarrierInWater = new ArrayList<>();
        location = new ArrayList<>();
        Placasenaire = new ArrayList<>();
    }
    /**
     * Crea la ubicaciones de los objetos
     *
     *
     */
    public void setLocation(Location location1)
    {
        boolean existlo= false;
        if(location.contains(location1))
        {
            existlo=true;
        }
        if(!existlo) {
            this.location.add(location1);
        }
    }
    /**
     * Agrega los barcos validos a la lista de barcos en el agua
     *
     *
     */
    public void setShips(Ship ship, Location location1)
    {
        boolean exist = false;
        boolean existlo= false;
        if (NumOfShips >= ShipInWater.size())
        {
            if(ShipInWater.contains(ship))
            {
                exist=true;
            }
            if(!exist) {
                if(ShipInWater.contains(location1))
                {
                    existlo=true;
                }
                if(!existlo) {
                    ShipInWater.add(ship);
                }
            }
        }

    }
    /**
     * Agrega las aeronaves validos a la lista de aeronaves en el agua
     *
     *
     */
    public void setAircraft(Aircraft aircraft, Location location1)
    {
        boolean exist = false;
        boolean existlo= false;
        if (NumOfShips >= AircraftInWater.size())
        {
            if(AircraftInWater.contains(aircraft))
            {
                exist=true;
            }
            if(!exist) {
                if(AircraftInWater.contains(location1))
                {
                    existlo=true;
                }
                if(!existlo) {
                    AircraftInWater.add(aircraft);
                }
            }
        }

    }
    /**
     * Agrega los portaaviones validos a la lista de portaviones en el agua
     *
     *
     */
    public void setAircraftCarrier(AircraftCarrier aircraftCarrier, Location location1)
    {
        boolean exist = false;
        boolean existlo= false;
        if (NumOfShips >= AircraftCarrierInWater.size())
        {
            if(AircraftCarrierInWater.contains(aircraftCarrier))
            {
                exist=true;
            }
            if(!exist) {
                if(AircraftCarrierInWater.contains(location1))
                {
                    existlo=true;
                }
                if(!existlo) {
                    AircraftCarrierInWater.add(aircraftCarrier);
                }
            }
        }
    }
    /**
     * obtiene las licencias de las aeronaves y las guarda en una lista
     *
     *
     */
    public void InAir(Aircraft aircraft)
    {
        if(AircraftInWater.contains(aircraft))
        {
            Placasenaire.add(aircraft.getLicencePlate());
        }

    }

    public ArrayList<String> getPlacasenaire() {
        return Placasenaire;
    }

    public String getName() {
        return name;
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
        return this.name == navy.getName();
    }

}
