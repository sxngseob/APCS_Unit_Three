import java.util.Scanner;

public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {

        double disVal = (Math.pow(b, 2)) - 4 * a * c;

        if (disVal < 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots";
        } else if (disVal > 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 real roots";
        } else {
            return a + "x^2 + " + b + "x + " + c + " has 1 real root";
        }

    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficients for a quadratic equation:");
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();

        System.out.println(roots(a1, b1, c1));

    }
}
