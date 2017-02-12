/**
 * Created by vld62 on 2/12/17.
 */
import java.util.Scanner;

public class TrapezeCalc {
    public static void main (String [] args){
        float a,b,h;
        float s;
        Scanner in= new Scanner(System.in);
        //Input a,b and h
        System.out.println("Enter trapeze length: ");
        a = in.nextInt();
        System.out.println("Enter trapeze width: ");
        b = in.nextInt();
        System.out.println("Enter trapeze height: ");
        h = in.nextInt();
        System.out.println("Trapeze length is: " + a + " , width is: " + b +" , height is: "+ h +" .");
        //Calculate Area
        s = ((a + b)/(h * h));
        System.out.println("Trapeze area is: " + s);
    }
}
