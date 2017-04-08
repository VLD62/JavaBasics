import java.util.Scanner;

/**
 * Created by vld62 on 4/8/17.
 * Напишете програма, която открива колко пъти даден подниз се съдържа
 в текст. Например, ако търсим подниза "in" в текста:
 We are living in a yellow submarine. We don't have anything else.
 Inside the submarine is very tight. So we are drinking all the
 day. We will move out of it in 5 days.
 Резултатът е 9.
 */
public class FindSubstringInText {
    public static void substringFinder (String text, String substring) {
        int counter = 0;
        for (int n = text.toLowerCase().indexOf(substring.toLowerCase()); n >=0;
             n = text.toLowerCase().indexOf(substring.toLowerCase(), n+1)) {
           counter++;
        }
        System.out.println("Substring " + substring + " is found " + counter + " times in the text");

    }

    public static void main (String [] Args) {
        String word,text;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert text: ");
        text = in.nextLine();
        System.out.println("Please insert substring : ");
        word = in.nextLine();
        substringFinder(text,word);
    }

}
