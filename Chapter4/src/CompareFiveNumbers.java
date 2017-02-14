import java.util.Scanner;

/**
 * Created by viliev on 14.2.2017 г..
 */
public class CompareFiveNumbers {
    public static void main (String [] args){
        int a,b,x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a = in.nextInt();
        System.out.println("Please enter second number: ");
        b =  in.nextInt();
        System.out.println("Please enter third number: ");
        x =  in.nextInt();
        System.out.println("Please enter fourth number: ");
        y =  in.nextInt();
        System.out.println("Please enter fifth number: ");
        z =  in.nextInt();

        if (a > b &&  a > x && a > y && a> z )
            System.out.println("Bigger number is:  "+ a);
        else if ( b > a && b > x && b > y && b > z )
            System.out.println("Bigger number is:  "+ b);
        else if ( x > a && x > b && x > y && x > z )
            System.out.println("Bigger number is:  "+ x);
        else if ( y > a && y > b && y > x && y > z )
            System.out.println("Bigger number is:  "+ y);
        else if ( z > a && z > b && z > x && z > y )
            System.out.println("Bigger number is:  "+ z);
        else
            System.out.println("Numbers that you entered are not distinct.");
    }
}
