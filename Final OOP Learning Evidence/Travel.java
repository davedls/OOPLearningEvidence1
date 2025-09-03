import java.util.Scanner;

public class Travel {
    private String firstName, lastName, nationality, sex;
    private int age;
    protected Scanner scan = new Scanner(System.in);

    public Travel() {
    }

    public void setTravelInfo(String firstName, String lastName, int age, String nationality, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }

    public void setTravelInfo() {
        System.out.println("|=====================\n|\n|Personal Information\n|\n|=====================");
        System.out.print("|First Name: ");
        this.firstName = scan.nextLine();
        System.out.print("|Last Name: ");
        this.lastName = scan.nextLine();

        while (true) {
            System.out.print("|Age: ");
            try {
                this.age = Integer.parseInt(scan.nextLine());
                if (this.age >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Age cannot be negative.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.print("|Nationality: ");
        this.nationality = scan.nextLine();
        System.out.print("|Sex: ");
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
        System.out.println("|=====================\n|\n|Ticket Details\n|\n|=====================\n|Full Name: " + getFirstName() + " " + getLastName() + "\n|Age: " + getAge() + "\n|Nationality: " + getNationality() + "\n|Sex: " + getSex());
    }

}

