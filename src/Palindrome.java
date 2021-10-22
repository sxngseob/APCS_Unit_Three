public class Palindrome {

    // Write your isPalindrome method in the space below. You do not need to write a main method for this program
    // Your method should be static.
    public static boolean isPalindrome(int num){

        int num2 = (int) (num * .1);
        int num3 = num - num2 * 10;

        int num4 = (num / 10000) * 10000;
        int num5 = num - num4;
        int num6 = (int) (num5 * 0.001);

        int num7 = num / 100; // 123
        int num8 = num - (num7 * 100); //21
        int num9 = (int) (num8 * 0.1);


        if ((num / 10000) == 0) {
            return false;
        } else if (num3 == num / 10000 && num6 == num9) {
            return true;
        } else {
            return false;
        }

    }
}
