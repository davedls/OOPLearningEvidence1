import java.util.Scanner;
public class Travel {
    private String firstName, lastName, nationality, sex;
    private int age;
    protected Scanner scan = new Scanner(System.in);

    public Travel(){}

    public void setTravelInfo(){
        System.out.println("\n--------------------\n");
        System.out.print("First Name: ");
        this.firstName = scan.nextLine();
        System.out.print("Last Name: ");
        this.lastName = scan.nextLine();
        System.out.print("Age: ");
        this.age = Integer.parseInt(scan.nextLine());
        System.out.print("Nationality: ");
        this.nationality = scan.nextLine();
        System.out.print("sex: ");
        this.sex = scan.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSex() {
        return sex;
    }

    public void displayPersonalInfo() {
        System.out.println("\nPersonal Information:\nFull Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nNationality: " + getNationality() + "\nSex: " + getSex() + "\n\n");
    }


}

