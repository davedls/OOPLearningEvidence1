
public class Ticket extends Travel {
    /* Essential Ticket Components */
    private String origin, destination, travelClass, PriceInput;
    private int departureHours, departureMinutes, arrivalHours, arrivalMinutes, ticketPrice;
    private String[][] doubleDigit = {{"", ""}, {"", ""}}; // Assisted with AI
    double ticketPriceDiscount; // Assisted with AI

    public Ticket() {
    }

    // Overloaded: set with parameters // Assisted with AI
    public void setTicketInfo(String origin, String destination, String travelClass, int depHour, int depMin, int arrHour, int arrMin, int ticketPrice) {
        super.setTravelInfo("John", "Doe", 30, "American", "Male");
        this.origin = origin;
        this.destination = destination;
        this.travelClass = travelClass;

        this.departureHours = depHour;
        this.departureMinutes = depMin;
        this.arrivalHours = arrHour;
        this.arrivalMinutes = arrMin;
        this.ticketPrice = ticketPrice;
        this.ticketPriceDiscount = ticketPriceDiscount;
    }

    // Overloaded: interactive input // Assisted with AI
    public void setTicketInfo() {

        super.setTravelInfo(); // Assisted with AI
        System.out.println("|=====================\n|\n|Travel Details\n|\n|=====================");
        System.out.print("|Origin: ");
        this.origin = scan.nextLine();

        System.out.print("|Destination: ");
        this.destination = scan.nextLine();

        System.out.print("|Travel Class: ");
        this.travelClass = scan.nextLine();

        while (true) { // Assisted with AI
            System.out.print("|Departure Time (HH:MM): ");
            String depTime = scan.nextLine();
            String[] parts = depTime.split(":");

            if (parts.length != 2) {
                System.out.println("| <ERROR><[ Invalid format. Please enter time as HH:MM ]><ERROR>");
                continue;
            }

            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);

                if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                    System.out.println("| <ERROR><[ Time must be between 00:00 and 23:59 ]><ERROR>");
                    continue;
                }
                if (hours < 10) {
                    this.doubleDigit[0][0] = "0";
                }
                if (minutes < 10) {
                    this.doubleDigit[0][1] = "0";
                }

                this.departureHours = hours;
                this.departureMinutes = minutes;

                break;
            } catch (NumberFormatException e) {
                System.out.println("| <ERROR><[ Please enter numbers only. Example: 08:30 ]><ERROR>");
            }
        }
        while (true) { // Assisted with AI
            System.out.print("|Arrival Time (HH:MM): ");
            String depTime = scan.nextLine();
            String[] parts = depTime.split(":");

            if (parts.length != 2) {
                System.out.println("| <ERROR><[ Invalid format. Please enter time as HH:MM ]><ERROR>");
                continue;
            }

            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);

                if (hours < 0 || hours > 23 && minutes < 0 || minutes > 59) {
                    System.out.println("| <ERROR><[ Time must be between 00:00 and 23:59 ]><ERROR>");
                    continue;
                }
                if (hours < 10) {
                    this.doubleDigit[1][0] = "0";
                }
                if (minutes < 10) {
                    this.doubleDigit[1][1] = "0";
                }

                this.arrivalHours = hours;
                this.arrivalMinutes = minutes;
                break;
            } catch (NumberFormatException e) {
                System.out.println("| <ERROR><[ Please enter numbers only. Example: 08:30 ]><ERROR>");
            }
        }
        while (true) { // Assisted with AI
            System.out.print("|Ticket Price: ");
            this.PriceInput = scan.nextLine();
            try {
                this.ticketPrice = Integer.parseInt(PriceInput);

                if (this.ticketPrice >= 0) {
                    this.ticketPrice = ticketPrice;
                    if (this.ticketPrice == 0) {
                        System.out.println("Free ticket! Free travel!");
                    }
                    break;
                } else {
                    System.out.println("| <ERROR><[ Please enter a valid number. Negative numbers are invalid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("| <ERROR><[ Please enter numbers only ]><ERROR>");
            }
        }

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

    // Overloaded: discounted price // Assisted with AI
    public double getTicketPrice(double discount) {
        double discountedPrice = ticketPrice - discount;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }

        return discountedPrice;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void displayTravelDetails() {
        System.out.print("Route: " + getOrigin() + " - " + getDestination() + "\n|Scheduled Departure: " + doubleDigit[0][0] + getDepartureHours() + ":" + doubleDigit[0][1] + getDepartureMinutes() + "\n|Scheduled Arrival: " + doubleDigit[1][0] + getArrivalHours() + ":" + doubleDigit[1][1] + getArrivalMinutes());
    }

    public void displayTicketDetails() {
        System.out.println("\n|Ticket Price: " + getTicketPrice() + "\nDiscounted Ticket Price: " + getTicketPrice(10)+ "\n|Travel Class: " + getTravelClass());
    }


}

