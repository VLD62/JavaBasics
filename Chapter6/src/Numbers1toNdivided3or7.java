import java.util.Scanner;

/**
 * Created by vld62 on 2/16/17.
 */
public class Numbers1toNdivided3or7 {
    public static void main (String [] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        n = in.nextInt();
        for (int i=1;i<=n;i++){
            if (i % 7 ==0  | i % 3 ==0 ) {
            } else {
                System.out.println(i);
            }
        }
    }
}
