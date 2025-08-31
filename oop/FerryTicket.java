public class FerryTicket extends Ticket{
    private String ferryCompany, vesselName;

    public FerryTicket(){}

    public void setFerryInfo(){
        super.setTicketInfo();
        System.out.print("Cruise Line: ");
        this.ferryCompany = scan.nextLine();
        System.out.print("Vesel Name: ");
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
        System.out.println("Ferry ");
        super.displayTravelDetails();
        System.out.println("\nFerry Company: " + getFerryCompany() + "\nVessel Name: " + getVesselName());
    }

}


