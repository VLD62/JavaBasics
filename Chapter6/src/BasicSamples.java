import java.util.Scanner;

/**
 * Created by viliev on 16.2.2017 г..
 */
public class BasicSamples {
    public static void main (String [] args){
        //Initialize counter
        int counter = 0;
        //Check the loop condition
        while ( counter < 10) {
            //Execute statements in the loop if the result is true
            System.out.println("Number : " + counter);
            counter++;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("n = ");
        int n = input.nextInt();
        int num = 1;
        int sum = 1;
        System.out.println("1 + ");
        while  (num<n) {
            num++;
            sum += num;
            System.out.print(" +  " + num);
        }
        System.out.println(" = " + sum);

    }
}
