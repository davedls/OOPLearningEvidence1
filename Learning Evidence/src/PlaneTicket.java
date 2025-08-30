public class PlaneTicket extends Travel {
    private String airline;
    private String flightNumber;

    public PlaneTicket(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice, String airline, String flightNumber) {
        super(firstName, lastName, age, nationality, origin, destination, departureHours, departureMinutes, arrivalHours, arrivalMinutes, travelClass, ticketPrice);
        this.airline = airline;
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public void displayDetails() {
        System.out.print("\nFlight ");
        super.displayDetails();
    }

    @Override
    public void displayTicketDetails() {
        System.out.println("\nAirline: " + getAirline() + "\nFlight Number: " + getFlightNumber() + "\nTicket Price: " + getTicketPrice());
    }
}