public class FerryTicket extends Ticket {
    private String ferryCompany, vesselName;

    public FerryTicket() {
    }

    // Overloaded: parameters // Assisted with AI
    public void setFerryInfo(String ferryCompany, String vesselName) {
        this.ferryCompany = ferryCompany;
        this.vesselName = vesselName;
    }

    // Interactive input // Assisted with AI
    public void setFerryInfo() {
        super.setTicketInfo(); // Assisted with AI
        System.out.print("|Cruise Line: ");
        this.ferryCompany = scan.nextLine();
        System.out.print("|Vesel Name: ");
        this.vesselName = scan.nextLine();
    }

    public String getFerryCompany() {
        return ferryCompany;
    }

    public String getVesselName() {
        return vesselName;
    }

    @Override
    public void displayTravelDetails() {
        System.out.print("|Ferry "); // Assisted with AI
        super.displayTravelDetails();
        System.out.println("\n|Ferry Company: " + getFerryCompany() + "\n|Vessel Name: " + getVesselName());
    }

}

