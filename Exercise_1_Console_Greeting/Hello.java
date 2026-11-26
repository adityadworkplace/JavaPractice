import java.util.Scanner;

class Name {
    public String askName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String s = sc.nextLine();
        return s;
    }
}

public class Hello {
    public static void main(String[] args){
        Name a = new Name();
        System.out.print("Hello " + a.askName());
    }
}
