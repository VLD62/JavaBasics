/**
 * Created by viliev on 15.2.2017 г..
 */
import java.util.Scanner;
public class EquationSqrt {
    public static void main (String [] args){
        double a,b,c,x1,x2,d;
        Scanner in = new Scanner (System.in);
        System.out.println("This program calculate sqr roots of equation: ax^2 + bx + c");
        System.out.println("Please enter value for a: ");
        a = in.nextInt();
        System.out.println("Please enter value for b: ");
        b = in.nextInt();
        System.out.println("Please enter value for c: ");
        c = in.nextInt();
        d= Math.sqrt((b*b - 4*a*c));
        System.out.println("D is : "+d);

       if (d>=0) {
           if (d == 0) {
               x1 = (-1 * b) / (2 * a);
               System.out.println("D = 0 and roots are equal x1=x2=" + x1);
           }   else {
               x1 = (-1*b+d)/(2*a);
               x2 = (-1*b-d)/(2*a);
               System.out.println("D > 0 roots are x1 = " +x1 + " x 2= " + x2);
           }


       } else {
           System.out.println("D <0 and equation does not have real roots.");
       }

    }
}



