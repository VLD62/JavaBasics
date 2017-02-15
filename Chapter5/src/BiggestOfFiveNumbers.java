import java.util.Scanner;

/**
 * Created by viliev on 15.2.2017 г..
 */

public class BiggestOfFiveNumbers {
    public static void main (String [] args){
        int a,b,x,y,z,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a = temp =in.nextInt();
        System.out.println("Please enter second number: ");
        b =  in.nextInt();
        System.out.println("Please enter third number: ");
        x =  in.nextInt();
        System.out.println("Please enter fourth number: ");
        y =  in.nextInt();
        System.out.println("Please enter fifth number: ");
        z =  in.nextInt();
        if (a > b &&  a > x && a > y && a> z )
            temp = a;
        else if ( b > a && b > x && b > y && b > z )
            temp = b;
        else if ( x > a && x > b && x > y && x > z )
            temp = x;
        else if ( y > a && y > b && y > x && y > z )
            temp = y;
        else if ( z > a && z > b && z > x && z > y )
            temp = z;
        else
           System.out.println("Numbers that you entered are equal to: "+temp);
        System.out.println("Biggest number is: " + temp);
    }
}