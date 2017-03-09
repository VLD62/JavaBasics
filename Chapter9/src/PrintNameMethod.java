/**
 * Created by viliev on 8.3.2017 г..
 * Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!" (например "Hello, Peter!").
 * Напишете програма, която тества този метод.
 */
import  java.util.Scanner;
public class PrintNameMethod {

    public static void printConsole (String name) {

        System.out.println("Hello, " + name + "!");

    }

    public static void main (String [] args){
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter name: ");
        name = in.nextLine();
        printConsole(name);

    }
}
