/**
 * Created by vld62 on 2/12/17.
 */
import  java.util.Scanner;

public class BooleanGender {
    public static void main (String [] args) {
        /*Декларирайте променлива isMale от тип boolean и присвоете стойност
        на последната в зависимост от вашия пол. */
        boolean isMale ;
        String genre;
        Scanner in = new Scanner(System.in);
        //Select gender
        System.out.println("Please type your gender - male or female: ");
        genre = in.nextLine();

        if (genre.equals("male")) {
            isMale = true;
            System.out.println("Your genre is male");
        } else {
            if(genre.equals("female")){
            isMale = false;
            System.out.println("Your Genre is female");
            }
            else {
            System.out.println("Your Genre is unknown");
            isMale = false;
            }
        }

        System.out.println("Variable isMale is set to: " + isMale);
        System.out.println("Variable genre is set to: " + genre);

    }

}
