import java.util.Scanner;

/**
 * Created by viliev on 13.2.2017 г..
 */
public class CheckPrimeNumber {
    public static void main (String [] args){
        int n;
        int temp;
        boolean isPrime = true;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter number lower than 100: ");
        n  = in.nextInt();
        if (n < 100) {
            //Check if number is prime
            for (int i=2;i<=n/2;i++)
            {
                temp=n%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("Number :" + n + " is prime number.");
            } else {
                System.out.println("Number :" + n + " is not prime number.");
            }

        } else {
            System.out.println("Sorry this program works with numbers lower than 100 only.");
        }
    }
}
