import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("|1}   Ferry\n|2}   Airplane\nMeans of Travel: ");
        int TransportMode = Integer.parseInt(scan.nextLine());
        System.out.println("\n--------------------\n");
        if(TransportMode == 1){
            PlaneTicket flight = new PlaneTicket();
            flight.setFlightInfo();
            flight.displayPersonalInfo();
            flight.displayTravelDetails();
            flight.displayTicketDetails();
        } else if(TransportMode == 2){
            FerryTicket cruise = new FerryTicket();
            cruise.setFerryInfo();
            cruise.displayPersonalInfo();
            cruise.displayTravelDetails();
            cruise.displayTicketDetails();
        }
        
        
        
        
    }
}