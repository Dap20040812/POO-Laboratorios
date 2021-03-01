import java.util.ArrayList;

public class Main {
    public static void main(String[] arg)
    {
        ArrayList<String> f= new ArrayList<>();

        Navy navy = new Navy("FDF","dfd",10);
        Location location = new Location(20, 30);
        Location location1 = new Location(100, 30);
        AircraftCarrier aircraftCarrier = new AircraftCarrier(12,100,location,navy);
        Marine marine = new Marine("j","Marine",true,navy);
        Marine marine1 = new Marine("jj","Marine",true,navy);
        Aircraft aircraft = new Aircraft("hhh",true,100,location1,navy,marine,marine1);
        navy.setAircraft(aircraft);
        Board b = new Board();
        Marine marine9 = new Marine("j","Marine",false,navy);
        Marine marine19 = new Marine("jj","Marine",false,navy);

        System.out.println(b.enAire(navy));
    }
}
