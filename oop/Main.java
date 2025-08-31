import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("|1}   Ferry\n|2}   Airplane\nMeans of Travel: ");
        while(true){      
            try {
                while(true){
                    int TransportMode = Integer.parseInt(scan.nextLine());
                    if(TransportMode == 1){
                        PlaneTicket flight = new PlaneTicket();
                        flight.setFlightInfo();
                        flight.displayPersonalInfo();
                        flight.displayTravelDetails();
                        flight.displayTicketDetails();
                        break;
                    } else if(TransportMode == 2){
                        FerryTicket cruise = new FerryTicket();
                        cruise.setFerryInfo();
                        cruise.displayPersonalInfo();
                        cruise.displayTravelDetails();
                        cruise.displayTicketDetails();
                        break;
                    } else {
                        System.out.println("Number not found");
                        continue;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only.");
            }
        }
    }
}
