import java.util.Locale;
import java.util.Scanner;

public class PigLatin {

    public static String makePigLatin(String word1) {

        String word = word1.toLowerCase();
        String vowelWord = word + "yay";


        if (word.substring(0,1) == "a"){
            return vowelWord;
        } else if (word.substring(0,1) == "e") {
            return vowelWord;
        } else if (word.substring(0,1) == "i") {
            return vowelWord;
        } else if (word.substring(0,1) == "o") {
            return vowelWord;
        } else if (word.substring(0,1) == "u") {
            return vowelWord;
        } else if (word.substring(0,1) == "y") {
            String yWord = word.substring(1) + word.substring(0,1) + "ay";
            return yWord;
        } else if (word.substring(0,1) == "x") {
            return "a";
        } else {
            String consWord =  word.substring(1) + word.substring(0,1) + "ay";
            return consWord;
        }

    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput1 = scan.nextLine();
        String userInput = userInput1.toLowerCase();

        System.out.println(makePigLatin(userInput));
    }

}
