import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlight {

    Pilot pilot;
    CabinCrew cabinCrew;
    ArrayList<CabinCrew> cabinCrewList;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane1;
    Plane plane2;
    ArrayList<Passenger> passengerList;
    String flightNumber;
    Airport destinationAirport;
    Airport departureAirport;
    String departureTime;
    Flight flight;

    @Before
    public void before(){
        pilot = new Pilot("Bob", Rank.CAPTAIN, "JH123456");
        cabinCrew = new CabinCrew("Lou");
        cabinCrewList = new ArrayList<CabinCrew>();
        cabinCrewList.add(cabinCrew);
        passenger1 = new Passenger("Ian", 2);
        passenger2 = new Passenger("Ally", 1);
        passengerList = new ArrayList<Passenger>();
        plane1 = new Plane(PlaneType.BIG);
        plane2 = new Plane(PlaneType.SMALL);
        flightNumber = "HJ654321";
        destinationAirport = Airport.GLA;
        departureAirport = Airport.EDI;
        departureTime = "1300";
        flight = new Flight(
                pilot,
                cabinCrewList,
                plane1,
                flightNumber,
                destinationAirport,
                departureAirport,
                departureTime);
    }

    @Test
    public void testGetFlightCapacity(){
        assertEquals(5, flight.getFlightCapacity());
    }

    @Test
    public void testGetSeatsBooked(){
        assertEquals(0, flight.getSeatsBooked());
    }

    @Test
    public void testGetSeatsRemaining(){
        assertEquals(5, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassengerPass(){
        flight.bookPassenger(passenger1);
        assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassengerFail(){
        flight.setPlaneType(plane2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(1, flight.getSeatsBooked());
    }

    @Test
    public void testGetPlaneType(){
        assertEquals(PlaneType.BIG, flight.getPlaneType());
    }

    @Test
    public void testSetPlaneType(){
        flight.setPlaneType(plane2);
        assertEquals(PlaneType.SMALL, flight.getPlaneType());
    }

    @Test
    public void testPilotFly(){
        assertEquals("Fly", flight.pilotFly());
    }

    @Test
    public void testCabinCrewAnnounce(){
        assertEquals("Announce", flight.cabinCrewAnnounce());
    }
}
