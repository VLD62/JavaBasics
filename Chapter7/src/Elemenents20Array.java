import java.util.Arrays;

/**
 * Created by viliev on 20.2.2017 г..
 * Да се напише програма, която създава масив с 20 елемента от целочислен
 * тип и инициализира всеки от елементите със стойност равна на индекса
 * на елемента умножен по 5. Елементите на масива да се изведат на конзолата.
 *
 */
public class Elemenents20Array {
    public static void main (String [] args){
        int Array [] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0 ; i < Array.length; i++) {
            Array[i] = 5*Array[i];
        }
    System.out.println("Elements of the Array are: " + Arrays.toString(Array));

    }

}
