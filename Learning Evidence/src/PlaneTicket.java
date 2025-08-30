public class PlaneTicket extends Ticket {
    /* Essential Airline Ticket Components */
    private String airline;
    private String flightNumber;
    private String seatNumber;
    private String inFlightMeal;

    public PlaneTicket(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice, String airline, String flightNumber, String seatNumber, String inFlightMeal) {
        super(firstName, lastName, age, nationality, origin, destination, departureHours, departureMinutes, arrivalHours, arrivalMinutes, travelClass, ticketPrice);
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.inFlightMeal = inFlightMeal;

    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getInFlightMeal() {
        return inFlightMeal;
    }

    @Override
    public void displayTravelDetails() {
        System.out.println("Flight ");
        super.displayTravelDetails();
    }

    @Override
    public void displayTicketDetails() {
        super.displayTicketDetails();
        System.out.println("\nSeat Number: " + getSeatNumber() + "\nIn-Flight Meal: " + getInFlightMeal());
    }
}



