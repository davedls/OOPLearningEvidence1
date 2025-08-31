public class TrainTicket extends Ticket{
    
    private String TrainStation, TrainNumber;

    public TrainTicket (){}

    public void setTrainInfo(){
        super.setTicketInfo();
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
        System.out.print("|Train");
        super.displayTravelDetails();
        System.out.println("|Train Station: " + getTrainStation() + "\n|Train Number: " + getTrainNumber());
    }



}
