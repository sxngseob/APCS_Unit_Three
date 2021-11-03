import java.util.Scanner;

public class EasterDate {

    public static boolean isValidYear(int year) {
        //if user-input is in the range
        if (year < 1900 || year > 2099) {
            return false;
        } else {
            return true;
        }
    }

    public static String dateOfEaster(int year) {

        //1954 1981 2049 2076
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        int date = 22 + d + e;

        if (isValidYear(year)) {

            //if
            if (year == 1954 || year == 1981 || year == 2049 || year == 2076) {
                int newDate = date - 7;
            } //if end

            //if else
            if (date > 31) {
                int aprilDate = date - 31;
                return "In " + year + " Easter is on April " + aprilDate;
            } else {
                return "In " + year + " Easter is on March " + date;
            } //if else end


        }

        return "You have entered an invalid year";

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year between 1900 and 2099");
        int userInputYear = scan.nextInt();
        System.out.print(dateOfEaster(userInputYear));


    }
}