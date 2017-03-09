import java.util.Scanner;

/**
 * Created by viliev on 9.3.2017 г..
 * Напишете метод, който връща английското наименование на последната цифра от дадено число.
 * Примери: за числото 512 отпечатва "two"; за числото 1024 – "four".
 */
public class LastLetterFromNumber {
    public static void extractLastDigit (int number) {
    String numberWord="";
    int lastDigit = number%10;

        switch  (lastDigit){
            case 0: numberWord = "zero";
                    break;
            case 1: numberWord = "one";
                    break;
            case 2: numberWord = "two";
                    break;
            case 3: numberWord = "three";
                    break;
            case 4: numberWord = "four";
                    break;
            case 5: numberWord = "five";
                    break;
            case 6: numberWord = "six";
                    break;
            case 7: numberWord = "seven";
                    break;
            case 8: numberWord = "eight";
                    break;
            case 9: numberWord = "nine";
                    break;

        }
        System.out.println("Last digit from entered number " + number + " is: " + numberWord);
    }

    public static void main (String [] Args){
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        number = in.nextInt();
        extractLastDigit(number);
    }
}
