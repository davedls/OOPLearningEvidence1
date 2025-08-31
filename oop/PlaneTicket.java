public class PlaneTicket extends Ticket {
    /* Essential Airline Ticket Components */
    private String airline, flightNumber, seatNumber, inFlightMeal;

    public PlaneTicket(){}

    public void setFlightInfo(){
        super.setTicketInfo();
        System.out.print("Airline: ");
        this.airline = scan.nextLine();
        System.out.print("Flight Number: ");
        this.flightNumber = scan.nextLine();
        System.out.print("Seat Number: ");
        this.seatNumber = scan.nextLine();
        System.out.print("Flight Meal: ");
        this.inFlightMeal = scan.nextLine();
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
        System.out.println("\n--------------------\n");
        super.displayTicketDetails();
        System.out.println("Seat Number: " + getSeatNumber() + "\nIn-Flight Meal: " + getInFlightMeal());
    }
}


