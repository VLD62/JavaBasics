import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/11/17.
 * Напишете програма, която решава следните задачи:
 - Обръща последователността на цифрите на едно число.
 - Пресмята средното аритметично на дадена редица.
 - Решава линейното уравнение a * x + b = 0.
 Създайте подходящи методи за всяка една от задачите.
 Напишете програмата така, че на потребителя да му бъде изведено
 текстово меню, от което да избира коя задача да решава.
 Направете проверка на входните данни:
 - Десетичното число трябва да е неотрицателно.
 - Редицата не трябва да е празна.
 - Коефициентът a не трябва да е 0.
 */
public class MathApp {

    public static void reverseDigits () {
        int y,x;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter positive number");
        x = in.nextInt();
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                y = x % 10;
                System.out.print(y);
                x = x / 10;
                if (x < 10) {
                    System.out.print(x);
                    x = 0;
                }
            }
        } else {
            System.out.println("Sorry you need to enter only positive number");
        }
    }

    public static void calculateAverage (){
        //Creation of user input based unsorted array
        Scanner in = new Scanner(System.in);
        int length, sum =0;
        System.out.println("Enter array length: ");
        length = in.nextInt();
        if (length == 0) {
            System.out.println("Sorry you need to select length of array more than 0!");
        } else {
            int[] Array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter " + i + " element of the Array.");
                Array[i] = in.nextInt();

            }


            if (Array == null) {
                System.out.println("Sorry array is null!");
            } else {

                for (int num : Array) {
                    sum = sum + num;
                }


                System.out.println("Array is " + Arrays.toString(Array));
                System.out.println("Sum of all elements in the array is " + sum);
            }
        }
    }

    public static void solveEquation () {
        double a,b,x;
        Scanner in = new Scanner(System.in);
        System.out.println("This program solves linear equation: a*x + b = 0 ");
        System.out.println("Please enter number a (different than 0): ");
        a = in.nextInt();
        if (a == 0) {
            System.out.println("Sorry you need to enter number different than 0!");
        } else {
            System.out.println("Please enter number b: ");
            b = in.nextInt();
            x = (-1)*b/a;
            System.out.println("x is equal to: " + x);
        }

    }

    public static void main (String [] Args) {
        int option = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please select task: ");
        System.out.println("1. Reverse digits of a number.");
        System.out.println("2. Calculate average number from array,");
        System.out.println("3. Solve linear equation.");
        option = in.nextInt();
        if (option == 1 || option == 2 || option == 3){
            switch (option) {
                case 1: reverseDigits(); break;
                case 2: calculateAverage(); break;
                case 3: solveEquation(); break;

            }
        } else {
            System.out.println("Invalid choice!");
        }



    }
}

