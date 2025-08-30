public class Main {
    public static void main(String[] args) {
        FullPlaneTicket flight = new FullPlaneTicket("Hiro", "Hamada", 20, "Japanese", "Tokyo", "Manila", 8, 15, 12, 45, "Economy Class", 500, "Japan Airlines", "JA701", "27A", "Ramen");
        flight.displayPersonalInfo();
        flight.displayDetails();
        flight.displayTicketDetails();
        System.out.println("\n--------------------\n");

        FullFerryTicket cruise = new FullFerryTicket("Kenji", "Yamada", 25, "Japanese", "Aomori", "Hokkaido", 5, 15, 6, 45, "Economy Class", 400, "Kaigai Cruises", "Akagi");
        cruise.displayPersonalInfo();
        cruise.displayDetails();
    }
}
