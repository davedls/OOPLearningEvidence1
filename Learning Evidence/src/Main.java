    public class Main {
        public static void main(String[] args) {
            PlaneTicket flight = new PlaneTicket("Hiro", "Hamada", 20, "Japanese", "Tokyo", "Manila", 8, 15, 12, 45, "Economy Class", 500, "Japan Airlines", "JA701", "27A", "Ramen");
            flight.displayPersonalInfo();
            System.out.println();
            flight.displayTravelDetails();
            System.out.println();
            flight.displayTicketDetails();
            System.out.println("\n--------------------\n");

            FerryTicket cruise = new FerryTicket("Kenji", "Yamada", 25, "Japanese", "Aomori", "Hokkaido", 5, 15, 6, 45, "Economy Class", 400, "Kaigai Cruises", "Akagi");
            cruise.displayPersonalInfo();
            System.out.println();
            cruise.displayTravelDetails();
            System.out.println();
            cruise.displayTicketDetails();
        }
    }
