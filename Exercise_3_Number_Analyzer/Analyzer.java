import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analyzer {

    public static int mod(int a, int b){
        return a%b;
    }

    public static List<Integer> factors(int n){
        List<Integer> a = new ArrayList<>();
        for(int i = 2; i <= n/2; i++){
            if(mod(n, i) == 0){
                a.add(i);
            }
        }
        return a;
    }

    public static List<Integer> digits(int n){
        List<Integer> a = new ArrayList<>();
        int counter = 0;
        if (n<0){n = -n;}
        do{
            if (n == 0){break;}
            a.add(mod(n, 10));
            counter++;
            n /= 10;
        }while(true);
        a.add(counter);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        sc.close();

        if (n == 0){
            System.out.println("The number is zero.");
            System.out.println("It is an even number.");
            System.out.println("It is not a prime number.");
            System.out.println("It is an Armstrong number.");
            System.out.println("It is a palindrome.");
            System.out.println("It is not a perfect number.");
            System.out.println("Sum of its digits: 0");
            System.out.println("Its reverse: 0");
        } else if (n < 0){
            List<Integer> digits = digits(n);
            int sum = 0;
            int reverse = 0;
            for (int i = 0; i < digits.getLast(); i++){
                sum += digits.get(i);
                reverse += digits.get(i) * Math.pow(10, digits.getLast() - 1 - i);
            }

            System.out.println("The number is negative.");
            if (mod(n, 2) == 0){
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
            System.out.println("It is not a prime number.");
            System.out.println("It is not an Armstrong number.");
            System.out.println("It is not a palindrome.");
            System.out.println("It is not a perfect number.");
            System.out.println("Sum of its digits: " + sum);
            System.out.println("Its reverse: " + reverse);
        } else {
            List<Integer> fact = factors(n);
            List<Integer> digits = digits(n);
            int sum = 0;
            int reverse = 0;
            int arm = 0;
            int factsum = 1;
            for (int i = 0; i < digits.getLast(); i++){
                sum += digits.get(i);
                reverse += digits.get(i) * Math.pow(10, digits.getLast() - 1 - i);
                arm += Math.pow(digits.get(i), digits.getLast());
            }
            for (int i = 0; i < fact.size(); i++){
                factsum += fact.get(i);
            }

            System.out.println("The number is positive.");
            if (mod(n, 2) == 0){
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
            if (fact.isEmpty()){
                System.out.println("It is a prime number.");
            } else {
                System.out.println("It is not a prime number.");
            }
            if (n == arm){
                System.out.println("It is an Armstrong number.");
            } else {
                System.out.println("It is not an Armstrong number.");
            }
            if (n == reverse){
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
            if (n == factsum){
                System.out.println("It is a perfect number.");
            } else {
                System.out.println("It is not a perfect number.");
            }
            System.out.println("Sum of its digits: " + sum);
            System.out.println("Its reverse: " + reverse);
        }
    }
}
