public class Ticket extends Travel {
    /* Essential Ticket Components */
    private String origin;
    private String destination;
    private int departureHours;
    private int departureMinutes;
    private int arrivalHours;
    private int arrivalMinutes;
    private int ticketPrice;
    private String travelClass;

    public Ticket(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice) {
        super(firstName, lastName, age, nationality);

        this.origin = origin;
        this.destination = destination;
        this.departureHours = departureHours;
        this.departureMinutes = departureMinutes;
        this.arrivalHours = arrivalHours;
        this.arrivalMinutes = arrivalMinutes;
        this.travelClass = travelClass;
        this.ticketPrice = ticketPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getDepartureHours() {
        return departureHours;
    }

    public int getDepartureMinutes() {
        return departureMinutes;
    }

    public int getArrivalHours() {
        return arrivalHours;
    }

    public int getArrivalMinutes() {
        return arrivalMinutes;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setDepartureHours(int departureHours) {
        if (departureHours >= 0 && departureHours <= 23) {

        } else {
            System.out.println("Invalid input. Enter a valid number from 0-23.");
        }
    }

    public void setDepartureMinutes(int departureMinutes) {
        if (departureMinutes >= 0 && departureMinutes <= 60) {

        } else {
            System.out.println("Invalid input. Enter a valid number from 0-59.");
        }
    }

    public void setArrivalHours(int ArrivalHours) {
        if (ArrivalHours >= 0 && ArrivalHours <= 23) {

        } else {
            System.out.println("Invalid input. Enter a valid number from 0-23.");
        }
    }

    public void setArrivalMinutes(int ArrivalMinutes) {
        if (ArrivalMinutes >= 0 && ArrivalMinutes <= 60) {

        } else {
            System.out.println("Invalid input. Enter a valid number from 0-59.");
        }
    }

    public void displayTravelDetails() {
        System.out.println("Route: " + getOrigin() + " - " + getDestination() + "\nScheduled Departure: " + getDepartureHours() + ":" + getDepartureMinutes() + "\nScheduled Arrival: " + getArrivalHours() + ":" + getArrivalMinutes());
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Price: " + getTicketPrice() + "\nTravel Class: " + getTravelClass());
    }

}