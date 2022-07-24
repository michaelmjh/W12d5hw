import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class TestPassenger {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob", 1);
    }

    @Test
    public void testGetPassengerName(){
        assertEquals("Bob", passenger.getPassengerName());
    }

    @Test
    public void testSetPassengerName(){
        passenger.setPassengerName("Lou");
        assertEquals("Lou", passenger.getPassengerName());
    }

    @Test
    public void testGetNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void testSetNumberOfBags(){
        passenger.setNumberOfBags(2);
        assertEquals(2, passenger.getNumberOfBags());
    }
}
