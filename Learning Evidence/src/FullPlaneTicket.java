public class FullPlaneTicket extends PlaneTicket {
    private String seatNumber;
    private String inFlightMeal;

    public FullPlaneTicket(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice, String airline, String flightNumber, String seatNumber, String inFlightMeal) {
        super(firstName, lastName, age, nationality, origin, destination, departureHours, departureMinutes, arrivalHours, arrivalMinutes, travelClass, ticketPrice, airline, flightNumber);
        this.seatNumber = seatNumber;
        this.inFlightMeal = inFlightMeal;

    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getInFlightMeal() {
        return inFlightMeal;
    }

    @Override
    public void displayTicketDetails() {
        super.displayTicketDetails();
        System.out.println("\nSeat Number: " + getSeatNumber() + "\nIn-Flight Meal: " + getInFlightMeal());
    }
}



