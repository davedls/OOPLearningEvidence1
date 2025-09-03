import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n|Transportation Method\n|---------------------\n|1}   Airplane\n|2}   Ferry\n|3}   Train\n|0}   Exit\n|---------------------");
            while (true) {
                try {
                    while (true) {
                        System.out.print("|Means of Travel: ");
                        int TransportMode = Integer.parseInt(scan.nextLine());
                        if (TransportMode == 1) {
                            System.out.println("You chose to fly via: Airplane");

                            // Assisted with AI: using PlaneTicket class with overloaded setFlightInfo
                            // Assisted with AI: displayPersonalInfo(), displayTravelDetails(), displayTicketDetails()
                            PlaneTicket flight = new PlaneTicket();
                            flight.setFlightInfo();
                            flight.displayPersonalInfo();
                            flight.displayTravelDetails();
                            flight.displayTicketDetails();
                            break;
                        } else if (TransportMode == 2) {
                            System.out.println("You chose to travel via: Ferry");

                            // Assisted with AI: using FerryTicket class with overloaded setFerryInfo
                            // Assisted with AI: displayPersonalInfo(), displayTravelDetails(), displayTicketDetails()
                            FerryTicket cruise = new FerryTicket();
                            cruise.setFerryInfo();
                            cruise.displayPersonalInfo();
                            cruise.displayTravelDetails();
                            cruise.displayTicketDetails();
                            break;
                        } else if (TransportMode == 3) {
                            System.out.println("You chose to travel via: Train");

                            // Assisted with AI: using TrainTicket class with overloaded setTrainInfo
                            // Assisted with AI: displayPersonalInfo(), displayTravelDetails(), displayTicketDetails()
                            TrainTicket Rails = new TrainTicket();
                            Rails.setTrainInfo();
                            Rails.displayPersonalInfo();
                            Rails.displayTravelDetails();
                            Rails.displayTicketDetails();
                            break;
                        } else if (TransportMode == 0) {
                            System.out.println("Exiting program...");
                            System.exit(0);
                        } else {
                            System.out.println("Number not found");
                            continue;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter numbers only.");
                }
                break;
            }
        }
    }
}