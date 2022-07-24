public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int getAllowedBaggagePerPassenger(Flight flight){
        int weightAvailable = flight.getFlightTotalWeight();
        int passengerCapacity = flight.getFlightCapacity();
        return weightAvailable / passengerCapacity;
    }
}
