import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by viliev on 21.3.2017 г..
 * Напишете програма, която извежда на стандартния изход броя на дните, часовете и минутите,
 * които са изтекли от 1 януари 1970 година до момента на изпълнението на програмата. За реализацията използвайте класа System.
 */
public class MinutesFrom1970ToProgramExecution {

    public static  void counter (int N) {
        System.out.println("Starting count:..");
        for (int i = 0 ; i < N ; i++ ) {
            System.out.print(N-i + ", ");
        }
    }

    public static void main (String [] Args) {
        int N ;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter value for counter: ");
        N = in.nextInt();
        counter(N);
        long endTime = System.currentTimeMillis();
        System.out.println("Counter finished since 1st of January 1970 until now within " + (endTime/1000)/86400 + " days, " + ((endTime/1000)/3600) + " hours and " + ((endTime/1000)/60) + " minutes." );
    }
}
