import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your First numeric input:");
        String a = scn.nextLine();
        double a1 = Double.parseDouble(a);
        System.out.println("Enter your Second numeric input:");
        String b = scn.nextLine();
        double b1 = Double.parseDouble(b);
        double c = a1 + b1;
        System.out.println("Your Answer is: "+c);
    }
}