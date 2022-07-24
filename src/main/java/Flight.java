import people.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger>passengerList;
    private Plane plane;
    private String flightNumber;
    private Airport destinationAirport;
    private Airport departureAirport;
    private String departureTime;

    public Flight(
            Pilot pilot,
            ArrayList<CabinCrew> cabinCrewList,
            Plane plane,
            String flightNumber,
            Airport destinationAirport,
            Airport departureAirport,
            String departureTime){
        this.pilot = pilot;
        this.cabinCrewList = cabinCrewList;
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public PlaneType getPlaneType(){
        return plane.getPlaneType();
    }

    public void setPlaneType(Plane plane){
        PlaneType planeType = plane.getPlaneType();
        this.plane.setPlaneType(planeType);
    }

    public int getFlightCapacity(){
        return plane.getPlaneCapacity();
    }

    public int getSeatsBooked(){
        return passengerList.size();
    }

    public int getAvailableSeats(){
        int planeCapacity = getFlightCapacity();
        int seatsBooked = getSeatsBooked();
        return planeCapacity - seatsBooked;
    }

    public void bookPassenger(Passenger passenger){
        if (getAvailableSeats() > 0){
            passengerList.add(passenger);
        }
    }

    public String pilotFly() {
        return pilot.fly();
    }

    public String cabinCrewAnnounce(){
        return cabinCrewList.get(0).announce();
    }

    public int getFlightTotalWeight(){
        return plane.getPlaneTotalWeight();
    }
}
