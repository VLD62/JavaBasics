import  java.util.Scanner;
/**
 * Created by vld62 on 4/8/17.
 * Напишете програма, която прочита символен низ, обръща го отзад
 напред и го принтира обратно на конзолата. Например: "introduction" 
 "noitcudortni".
 */
public class StringReverse {

    public static String stringReverser (String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--)
            sb.append(word.charAt(i));
        return sb.toString();
    }

    public static void main (String [] Args) {
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert string: ");
        word = in.nextLine();
        stringReverser(word);
        System.out.println("Reversed string is: " + stringReverser(word));

    }
}
