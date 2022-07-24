import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class TestPlane {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BIG);
    }

    @Test
    public void testGetPlaneType(){
        assertEquals(PlaneType.BIG, plane.getPlaneType());
    }

    @Test
    public void testSetPlaneType(){
        plane.setPlaneType(PlaneType.SMALL);
        assertEquals(PlaneType.SMALL, plane.getPlaneType());
    }

    @Test
    public void testGetPlaneCapacity(){
        assertEquals(5, plane.getPlaneCapacity());
    }

    @Test
    public void testGetPlaneTotalWeight(){
        assertEquals(10, plane.getPlaneTotalWeight());
    }
}
