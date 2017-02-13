/**
 * Created by vld62 on 2/13/17.
 */
import java.util.Scanner;
public class CirclePerimeterCalc {
    public static void main (String [] Args){
        int r;
        double p,l;
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter radius of the circle: ");
        r = in.nextInt();
        p = 2 * Math.PI * r;
        l = r * r * Math.PI;
        System.out.println("Perimeter of the circle is " + p
                + " , total length of the circle is "+ l + " .");

    }

}
