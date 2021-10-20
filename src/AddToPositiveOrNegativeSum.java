import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        // declare and instantiate a Scanner variable and object
        Scanner scan = new Scanner(System.in);
        // declare and initialize variables for a positive and negative sum
        int positiveNum = 0;
        int negativeNum = 0;

        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.print("Enter a number: ");
            int UserInput = scan.nextInt();

            if (UserInput > 0){
                positiveNum += UserInput;
            }

            if (UserInput < 0){
                negativeNum += UserInput;
            }

        } // end of for loop

        // output the sums. Make sure the format matches the sample
        System.out.println("The sum of the positive numbers is " + positiveNum);
        System.out.println("The sum of the negative numbers is " + negativeNum);

    }
}

