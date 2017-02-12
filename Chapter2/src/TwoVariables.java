/**
 * Created by vld62 on 2/12/17.
 */
public class TwoVariables {
    public static void main (String [] args){
        /*Декларирайте две променливи от тип int. Задайте им стойности
съответно 5 и 10. Разменете стойностите им и ги отпечатайте.*/
        int a = 5;
        int b = 10;
        int c = a;
        a  = b;
        b = c;
        System.out.println("A is: " + a);
        System.out.println("B is: " + b);

    }
}
