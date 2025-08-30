public class Travel {
    /* Personal Information */
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    public Travel(String firstName, String lastName, int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void displayPersonalInfo() {
        System.out.println("Personal Information:\nFull Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nNationality: " + getNationality());
    }

}