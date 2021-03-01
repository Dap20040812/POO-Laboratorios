import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    @DisplayName("GIVEN a board WHEN register a NAvy THEN should not allow")
    public void shouldNotAddNavy() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);
        Location location1 = new Location(20, 30);
        Marine marine = new Marine("j","Pilot",true,navy1);
        Marine marine1 = new Marine("jj","Copilot",true,navy1);
        Aircraft aircraft = new Aircraft("ddd",true,100,location,navy1,marine,marine1);
        Aircraft aircraft1 = new Aircraft("ddd",true,100,location1,navy1,marine,marine1);
        Board b = new Board();
        assertTrue(navy1.setAircraft(aircraft), "The student was successfully registered");
        assertFalse(navy1.setAircraft(aircraft1), "The student was successfully registered");
    }

    @Test
    @DisplayName("GIVEN a board WHEN register a NAvy THEN should not allow")
    public void shouldNotAddNarfvy() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);
        Location location1 = new Location(20, 30);
        Marine marine = new Marine("j","Pilot",true,navy1);
        Marine marine1 = new Marine("jj","Copilot",true,navy1);
        Aircraft aircraft = new Aircraft("ddd",true,100,location,navy1,marine,marine1);
        Aircraft aircraft1 = new Aircraft("ddd",true,100,location1,navy1,marine,marine1);
        Board b = new Board();
        assertTrue(navy1.setAircraft(aircraft), "The student was successfully registered");
        assertFalse(navy1.setAircraft(aircraft1), "The student was successfully registered");
    }

    @Test
    @DisplayName("GIVEN a board WHEN register a NAvy THEN should not allow")
    public void shouldNotAddNassvy() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);
        Ship ship = new Ship(1, 1,  location, navy1);
        Board b = new Board();
        Marine marine = new Marine("j","Marine",false,navy1);
        assertTrue(ship.addMarine(ship,marine));
        assertTrue(marine.isEnUso());
        assertEquals(1,navy1.getNumOfMarines());


    }

    @Test
    @DisplayName("GIVEN a board WHEN register a NAvy THEN should not allow")
    public void shddouldNotAddNassvy() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);
        Location location1 = new Location(100, 30);
        AircraftCarrier aircraftCarrier = new AircraftCarrier(12,100,location,navy1);
        Marine marine = new Marine("j","Marine",true,navy1);
        Marine marine1 = new Marine("jj","Marine",true,navy1);
        Aircraft aircraft = new Aircraft("hhh",false,100,location1,navy1,marine,marine1);
        Board b = new Board();
        Marine marine9 = new Marine("j","Marine",false,navy1);
        Marine marine19 = new Marine("jj","Marine",false,navy1);

        assertTrue(aircraftCarrier.addAircraft(aircraftCarrier,aircraft));
        assertTrue(aircraftCarrier.addMarine(aircraftCarrier,marine9));
        assertTrue(marine9.isEnUso());


    }

    @Test
    @DisplayName("GIVEN a board WHEN find alias THEN should return 1")
    public void shouldReturn1() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Navy navy2 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);
        Ship ship = new Ship(1, 1,  location, navy1);
        Board b = new Board();
        b.AddsNavy(navy1);
        b.AddsNavy(navy2);
        if (b.alias(navy1)== 1)
        {
            result=true;
        }
        assertTrue(result, "The student was successfully registered");

    }
    @Test
    @DisplayName("GIVEN a board WHEN find the licence of enemy aircraft THEN should return Licence")
    public void shouldReturnPlacaEnemigas() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2);
        Navy navy2 = new Navy("FFF", "2020", 2);
        Location location = new Location(20, 30);


    }
}
