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
        //Check for the point if it is inside the circle and rectangle
            boolean firstCase = Math.sqrt(x * x + y * y) <= 5; // First Condition
            boolean secondCase = ((x < -1 || x > 1 || y > 5) && y < 0) ; // Second Condition

            boolean resultThree = firstCase && secondCase;
            if (resultThree) {
                System.out.println("Point is inside the circle K and outside rectangular.");
            } else {
                System.out.println("Point is outside the circle K and inside rectangular.");
              }
        }

    }



