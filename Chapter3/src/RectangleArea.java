import java.util.Scanner;

/**
 * Created by vld62 on 2/12/17.
 */
public class RectangleArea {
    public static void main (String [] args){
        int l;
        int h;
        int p;
        int s;
        Scanner in= new Scanner(System.in);
        //Input h and l
        System.out.println("Enter rectangle length: ");
        l = in.nextInt();
        System.out.println("Enter rectangle height: ");
        h = in.nextInt();
        System.out.println("Rectangle length is: " + l +" , height is: "+ h +" .");
        //Calculate area and perimeter of rectangle
        p = ((2*l) + (2*h));
        s = (l*h);
        System.out.println("Rectangle perimeter is: " + p +" , area is: "+ s +" .");
    }
}
