public class TrainTicket extends Ticket {

    private String TrainStation, TrainNumber;

    public TrainTicket() {
    }

    // Overloaded: parameters // Assisted with AI
    public void setTrainInfo(String TrainStation, String TrainNumber) {
        this.TrainStation = TrainStation;
        this.TrainNumber = TrainNumber;
    }

    // Interactive input // Assisted with AI
    public void setTrainInfo() {
        super.setTicketInfo(); // Assisted with AI
        System.out.print("|Train Station: ");
        this.TrainStation = scan.nextLine();
        System.out.print("|Train Number: ");
        this.TrainNumber = scan.nextLine();
    }

    public String getTrainStation() {
        return TrainStation;
    }

    public String getTrainNumber() {
        return TrainNumber;
    }

    @Override
    public void displayTravelDetails() {
        System.out.print("|Train"); // Assisted with AI
        super.displayTravelDetails();
        System.out.println("|Train Station: " + getTrainStation() + "\n|Train Number: " + getTrainNumber());
    }


}

