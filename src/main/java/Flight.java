import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> flight;
    private String plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private DATE departureTime;

    public Flight(){
        this.flight = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

//    Number of passengers on plane
    public int passengerCount() { return this.flight.size(); }

//    Puts passenger on plane
    public void putPassengerOnPlane(Plane plane) {
        Passenger passenger = plane.removePassenger();
        this.plane.add(passenger);
    }

//    Plane Starts Empty
    public void plane() {
        this.plane.clear();
    }
}
}
