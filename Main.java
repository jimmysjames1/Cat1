public class Customers {
    private String FullName;
    private String dateOfBirth;
    private String Address;
    private String DateOfRegistration;
    private String Nationality;

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDateOfRegistration(String DateOfRegistration) {
        this.DateOfRegistration = DateOfRegistration;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }
    


    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getDateOfRegistration() {
        return DateOfRegistration;
    }

    public String getNationality() {
        return Nationality;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String fullNameInput = scanner.nextLine();

        System.out.println("Enter the date of birth: ");
        String dateOfBirthInput = scanner.nextLine();

        System.out.println("Enter Address: ");
        String AddressInput= scanner.nextLine();

        System.out.println("Enter the date of registration: ");
        String DateOfRegistrationInput = scanner.nextLine();

        System.out.println("Enter the Nationality: ");
        String NationalityInput = scanner.nextLine();

        Customers customer = new Customers();
        customer.setFullName(fullNameInput);
        customer.setDateOfBirth(dateOfBirthInput);
        customer.setAddress(AddressInput);
        customer.setDateOfRegistration(DateOfRegistrationInput);
        customer.setNationality(NationalityInput);

        System.out.println("Customer Information:");
        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Date of Birth: " + customer.getDateOfBirth());
        System.out.println("Customer Address:" + customer.getAddress());
        System.out.println("Customer Date of Registration: "+ customer.getDateOfRegistration());
        System.out.println("Customer Nationality:" + customer.getNationality());
    }
}