import java.util.Scanner; //A simple text scanner which can parse primitive types and strings using regular expressions.

public class NumberAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter third number: ");
        int num3 = in.nextInt();

        System.out.println("Enter forth number: ");
        int num4 = in.nextInt();

        System.out.println("Enter fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of the five numbers is:  " + (num1 + num2 + num3 + num4 + num5 / 5));
    }
}
