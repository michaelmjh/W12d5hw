import org.junit.Before;
import org.junit.Test;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class TestPilot {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bob", Rank.CAPTAIN, "JH123456");
    }

    @Test
    public void testGetPilotName(){
        assertEquals("Bob", pilot.getPilotName());
    }

    @Test
    public void testSetPilotName(){
        pilot.setPilotName("Lou");
        assertEquals("Lou", pilot.getPilotName());
    }

    @Test
    public void testGetPilotRank(){
        assertEquals(Rank.CAPTAIN, pilot.getPilotRank());
    }

    @Test
    public void testSetPilotRank(){
        pilot.setPilotRank(Rank.FIRST_OFFICER);
        assertEquals(Rank.FIRST_OFFICER, pilot.getPilotRank());
    }

    @Test
    public void testGetLicenceNumber(){
        assertEquals("JH123456", pilot.getLicenceNumber());
    }

    @Test
    public void testSetLicenceNumber(){
        pilot.setLicenceNumber("HJ654321");
        assertEquals("HJ654321", pilot.getLicenceNumber());
    }
}
