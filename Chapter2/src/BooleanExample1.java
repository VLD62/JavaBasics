/**
 * Created by vld62 on 2/11/17.
 */
public class BooleanExample1 {
    public static void main (String[] args) {
        //Declare some variables
        int a = 1;
        int b = 2;
        //Which one is greater
        boolean greaterAB = (a > b);
        //Is it equal to 1
        boolean equalA1 = (a == 1);
        //Print the result on Console
        if (greaterAB) {
            System.out.println("A > B");
        } else  {
            System.out.println("A <= B");
        }
    System.out.println("greaterAB= " + greaterAB);
    System.out.println("equalA1= " +equalA1);
    }

}

