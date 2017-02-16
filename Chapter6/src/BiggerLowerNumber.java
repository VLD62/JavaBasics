/**
 * Created by vld62 on 2/16/17.
 */
import java.util.Scanner;
public class BiggerLowerNumber {
    public static void main (String [] args){
    int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        n = in.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
}
