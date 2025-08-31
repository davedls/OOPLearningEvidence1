
public class Ticket extends Travel {
    /* Essential Ticket Components */
    private String origin, destination, travelClass;
    private int departureHours, departureMinutes, arrivalHours, arrivalMinutes, ticketPrice;
    

    public Ticket(){}

    public void setTicketInfo(){
        
        super.setTravelInfo();

        System.out.print("Origin: ");
        this.origin = scan.nextLine();

        System.out.print("Destination: ");
        this.destination = scan.nextLine();

        System.out.print("Travel Class: ");
        this.travelClass = scan.nextLine();

        while (true) {
            System.out.print("Departure Time (HH:MM): ");
            String depTime = scan.nextLine();
            String[] parts = depTime.split(":");

            if (parts.length != 2) {
                System.out.println("Invalid format. Please enter time as HH:MM.");
                continue;
            }
        
            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
            
                if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                    System.out.println("Time must be between 00:00 and 23:59.");
                    continue;
                }
        
                this.departureHours = hours;
                this.departureMinutes = minutes;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only. Example: 08:30");
            }
        }
        while (true) {
            System.out.print("Arrival Time (HH:MM): ");
            String depTime = scan.nextLine();
            String[] parts = depTime.split(":");

            if (parts.length != 2) {
                System.out.println("Invalid format. Please enter time as HH:MM.");
                continue;
            }
        
            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
            
                if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                    System.out.println("Time must be between 00:00 and 23:59.");
                    continue;
                }
        
                this.arrivalHours = hours;
                this.arrivalMinutes = minutes;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only. Example: 08:30");
            }
        }
        
        System.out.print("Ticket Price: ");
        this.ticketPrice = Integer.parseInt(scan.nextLine());
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

    public void displayTravelDetails() {
        System.out.println("\nRoute: " + getOrigin() + " - " + getDestination() + "\nScheduled Departure: " + getDepartureHours() + ":" + getDepartureMinutes() + "\nScheduled Arrival: " + getArrivalHours() + ":" + getArrivalMinutes() + "\n\n");
    }

    public void displayTicketDetails() {
        System.out.println("\nTicket Price: " + getTicketPrice() + "\nTravel Class: " + getTravelClass() + "\n\n");
    }

}