public class FullFerryTicket extends Travel{
    private String ferryCompany;
    private String vesselName;

    public FullFerryTicket(String firstName, String lastName, int age, String nationality, String origin, String destination, int departureHours, int departureMinutes, int arrivalHours, int arrivalMinutes, String travelClass, int ticketPrice, String ferryCompany, String vesselName) {
        super(firstName, lastName, age, nationality, origin, destination, departureHours, departureMinutes, arrivalHours, arrivalMinutes, travelClass, ticketPrice);
        this.ferryCompany = ferryCompany;
        this.vesselName = vesselName;
    }

    public String getFerryCompany() {
        return ferryCompany;
    }

    public String getVesselName() {
        return vesselName;
    }

    @Override
    public void displayDetails() {
        System.out.print("\nFerry ");
        super.displayDetails();
        System.out.println("\nFerry Company: " + getFerryCompany() + "\nVessel Name: " + getVesselName());
    }
}