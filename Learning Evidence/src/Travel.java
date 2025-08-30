public class Travel {
    /* Personal Information */
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    /* Essential Ticket Components */
    private String origin;
    private String destination;
    private int departureHours;
    private int departureMinutes;
    private int arrivalHours;
    private int arrivalMinutes;
    private int ticketPrice;
    private String travelClass;

    public Travel(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice) {
        this.age = age;
        this.nationality = nationality;
        this.firstName = firstName;
        this.lastName = lastName;
        this.origin = origin;
        this.destination = destination;
        this.departureHours = departureHours;
        this.departureMinutes = departureMinutes;
        this.arrivalHours = arrivalHours;
        this.arrivalMinutes = arrivalMinutes;
        this.travelClass = travelClass;
        this.ticketPrice = ticketPrice;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
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

    public void displayPersonalInfo() {
        System.out.println("Personal Information:\nFull Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nNationality: " + getNationality());
    }

    public void displayDetails() {
        System.out.println("Route: " + getOrigin() + " - " + getDestination() + "\nScheduled Time of Departure: " + getDepartureHours() + ":" + getDepartureMinutes() + "\nScheduled Time of Arrival: " + getArrivalHours() + ":" + getArrivalMinutes());
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Price: " + getTicketPrice() + "\nTravel Class: " + getTravelClass());
    }
}