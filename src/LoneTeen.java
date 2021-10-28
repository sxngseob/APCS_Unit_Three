import java.util.Scanner;

public class LoneTeen {

    // In the space below, write the loneTeen method. Make sure the signature matches
    public static boolean loneTeen(int num1, int num2) {

        if (13 <= num1 && num1 <= 19) {
            if (13 <= num2 && num2 <= 19) {
                return false;
            } else {
                return true;
            }
        } else if ((13 > num1 || num1 > 19)) {
            if (13 <= num2 && num2 <= 19) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
        // the one given in the instructions.
        public static void main (String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();

            System.out.print(loneTeen(num1, num2));
        }
    }