import java.util.Scanner;

/**
 * Created by vld62 on 2/12/17.
 */
public class CheckPointCircleRectangle {
    public static void main (String [] args){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        x = in.nextInt();
        System.out.println("Enter y coordinate: ");
        y = in.nextInt();
        if ( Math.sqrt(x*x + y*y) <= 5) {
            System.out.println("Point is inside the circle K.");
        } else {
            System.out.println("Point is outside the circle K.");
        }

    }
}
