import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static double mod(double a, double b){
        return a%b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        do{
            System.out.println("Enter an arithmatic operation with 2 operands and 1 operater(+, -, *, /, %) to get it solved.\nEnter exit to exit.\nAnything else is an invalid input.");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            if (input.isEmpty() || !input.matches("\\-?\\d+(\\.\\d+)?\\s*[+\\-*/%]\\s*\\-?\\d+(\\.\\d+)?")){
                System.out.println("Invalid Input");
                continue;
            }
            int operator_index = 0;
            char operator = '0';
            double a, b;
            for(char o:new char[]{'+','-','*','/','%'}){
                if(input.substring(1).indexOf(o) != -1){
                    operator_index = input.substring(1).indexOf(o) + 1;
                    operator = o;
                    break;
                }
            }
            a = Double.parseDouble(input.substring(0, operator_index).trim());
            b = Double.parseDouble(input.substring(operator_index+1, input.length()).trim());
            switch(operator){
                case '+':
                    result = add(a,b);
                    break;
                case '-':
                    result = sub(a,b);
                    break;
                case '*':
                    result = mul(a,b);
                    break;
                case '/':
                    if(b!=0){
                        result = div(a,b);
                    } else { System.out.println("Division by 0 not possible"); continue;}
                    break;
                case '%':
                    if(b!=0){
                        result = mod(a,b);
                    } else { System.out.println("Division by 0 not possible"); continue;}
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Result: " + result);
        }while(true);
        sc.close();
    }
}
