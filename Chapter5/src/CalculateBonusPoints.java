import java.util.Scanner;

/**
 * Created by viliev on 15.2.2017 г..
 */
public class CalculateBonusPoints {
    public static void main (String [] Args){
        int x,tmp;
        Scanner in = new Scanner(System.in);
        System.out.println("Please u input points from scale [1 - 9] :");
        x = in.nextInt();
        if (x < 1 && x > 9){
            System.out.println("Sorry this program works only with points from scale 1 to 9!");
        } else {

            switch (x){
                case 1:
                case 2:
                case 3: System.out.println("Bonus points are applied. New total is: " + x*10);break;
                case 4:
                case 5:
                case 6: System.out.println("Bonus points are applied. New total is: " + x*100);break;
                case 7:
                case 8:
                case 9: System.out.println("Bonus points are applied. New total is: " + x*1000);break;
            }

        }
    }
}
