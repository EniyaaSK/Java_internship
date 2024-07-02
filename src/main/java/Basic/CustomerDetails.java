import java.util.Scanner;

public class CustomerDetails {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of the customer to open SB account in MEC_BANK");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Date of Birth:");
        String dob = scanner.nextLine();
        System.out.println("Contact Number:");
        String contact = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Aadhaar Number:");
        String aadhaar = scanner.nextLine();
        System.out.println("PAN Number:");
        String pan = scanner.nextLine();
        System.out.println("Application submitted successfully for "+name +" in MEC_BANK.");
        scanner.close();


    }
}
