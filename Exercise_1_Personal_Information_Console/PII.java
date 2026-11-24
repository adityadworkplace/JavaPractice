import java.util.Scanner;

public class PII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Input user information.
        System.out.print("Enter your full name (First_name Last_name): ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        System.out.print("Enter your Mobile Number: ");
        String number = sc.next();
        System.out.print("Enter your City: ");
        String city = sc.next();

        // Index of space between first name and last name
        byte space = (byte) name.indexOf(" ");
        
        // Display info
        System.out.println("\n\nFirst Name: " + name.substring(0, space) + "   Last Name: " + name.substring(space + 1));
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Phone Number: " + number);

        // Users age after 5 years
        System.out.println("\nUsers age after 5 years: " + (age + 5));
    }
}
