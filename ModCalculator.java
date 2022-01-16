import java.util.Scanner;

public class ModCalculator {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter first number: ");
            String input1 = scn.nextLine();
            double a = Double.parseDouble(input1);
            System.out.println("Enter second number: ");
            String input2 = scn.nextLine();
            double b = Double.parseDouble(input2);
            System.out.println("Choose Operation(+,-,*,/): ");
            String opr = scn.nextLine();
            switch (opr) {
                case "+":
                System.out.println("Your Answer is: " +(a+b));
                break;
                case "-":
                System.out.println("Your Answer is: " +(a-b));
                break;
                case "*":
                System.out.println("Your Answer is: " +(a*b));
                break;
                case "/":
                System.out.println("Your Answer is: " +(a/b));
                break;
                default:
                System.out.println("Invalid Operation Selected");
                break;
            } 
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid number");
        }
    }
}
