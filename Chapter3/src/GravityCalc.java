import java.util.Scanner;

/**
 * Created by vld62 on 2/12/17.
 */
public class GravityCalc {
    public static void main (String [] args) {
        double weight, weight2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight of a person: ");
        weight = in.nextInt();
        //Calculate weight on moon
        weight2 = ((weight/9.81)*1.622);
        System.out.println("Weight of a person on Earth is: " + weight +". On the moon is: " + weight2 +".");
    }
}
