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
        Navy navy1 = new Navy("FFF", "2020", 2,2);
        Navy navy2 = new Navy("FFF", "2020", 2,2);
        Location location = new Location(20, 30);
        navy1.setLocation(location);
        Ship ship = new Ship(1, 1, 1, location, navy1);
        Board b = new Board();
        assertTrue(b.AddsNavy(navy1), "The student was successfully registered");
        assertFalse(b.AddsNavy(navy2), "The student was successfully registered");
    }

    @Test
    @DisplayName("GIVEN a board WHEN find alias THEN should return 1")
    public void shouldReturn1() {
        boolean result = false;
        Navy navy1 = new Navy("FFF", "2020", 2,2);
        Navy navy2 = new Navy("FFF", "2020", 2,2);
        Location location = new Location(20, 30);
        navy1.setLocation(location);
        Ship ship = new Ship(1, 1, 1, location, navy1);
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
        Navy navy1 = new Navy("FFF", "2020", 2,2);
        Navy navy2 = new Navy("FFF", "2020", 2,2);
        Location location = new Location(20, 30);
        navy1.setLocation(location);
        Aircraft aircraft = new Aircraft("20202",true,100,location,true);
        navy1.setAircraft(aircraft,location);
        Board b = new Board();
        b.AddsNavy(navy1);
        b.AddsNavy(navy2);


    }
}
