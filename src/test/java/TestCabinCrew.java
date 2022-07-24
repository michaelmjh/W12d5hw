import org.junit.Before;
import org.junit.Test;
import people.staff.CabinCrew;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class TestCabinCrew {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Bob");
    }

    @Test
    public void testGetCabinCrewName(){
        assertEquals("Bob", cabinCrew.getCabinCrewName());
    }

    @Test
    public void testSetCabinCrewName(){
        cabinCrew.setCabinCrewName("Lou");
        assertEquals("Lou", cabinCrew.getCabinCrewName());
    }

    @Test
    public void testGetCabinCrewRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getCabinCrewRank());
    }
}
