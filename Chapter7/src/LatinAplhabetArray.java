import java.util.Scanner;

/**
 * Created by viliev on 27.2.2017 г..
 * Да се напише програма, която създава масив с всички букви от латинската азбука.
 * Да се даде възможност на потребител да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.
 */
public class LatinAplhabetArray {
    public static  void  main (String [] args){
        char[] latinAlphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        word =  in.nextLine().toCharArray();

        for (int i = 0; i < word.length; i++)
            for (int j = 0; j < latinAlphabet.length; j++)
                if (word[i] == latinAlphabet[j]){
            System.out.println("Index of latter number " + i + " is: "+ j +" ");
                }

    }
}
