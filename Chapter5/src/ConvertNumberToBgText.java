/**
 * Created by viliev on 15.2.2017 г..
 */
import java.util.Scanner;
public class ConvertNumberToBgText {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insert number between 0 and 999 and the program will translate it on Bulgarian: ");
        int num = input.nextInt();
        int a = num/100;
        int b = num/10%10;
        int c = num%10;
        if (a>=1) {
            switch (a) {
                case 1 :System.out.print("Сто ");break;
                case 2 :System.out.print("Двеста ");break;
                case 3 :System.out.print("Триста ");break;
                case 4 :System.out.print("Четиристотин ");break;
                case 5 :System.out.print("Петстотин ");break;
                case 6 :System.out.print("Шестстотин ");break;
                case 7 :System.out.print("Седемстотин ");break;
                case 8 :System.out.print("Осемстотин ");break;
                case 9 :System.out.print("Деветстотин ");break;
            }
            if ( (b<=1) && (c!=0) ) {
                System.out.print("и ");
            }
        }
        if (b>1) {
            switch (b) {
                case 2 :System.out.print("двадесет ");break;
                case 3 :System.out.print("тридесет ");break;
                case 4 :System.out.print("четиридесет ");break;
                case 5 :System.out.print("петдесет ");break;
                case 6 :System.out.print("шестдесет ");break;
                case 7 :System.out.print("седемдесет ");break;
                case 8 :System.out.print("осемдесет ");break;
                case 9 :System.out.print("деветдесет ");break;
            }
            if ( (b!=0) && (c!=0) ) {
                System.out.print("и ");
            }
        }
        if ( (b!=1) && (c!=0) ){
            switch (c) {
                case 1 :System.out.print("eдно");break;
                case 2 :System.out.print("две");break;
                case 3 :System.out.print("три");break;
                case 4 :System.out.print("четири");break;
                case 5 :System.out.print("пет");break;
                case 6 :System.out.print("шест");break;
                case 7 :System.out.print("седем");break;
                case 8 :System.out.print("осем");break;
                case 9 :System.out.print("девет");break;
            }
        }
        if (b==1) {
            switch (c) {
                case 0 :System.out.print("десет");break;
                case 1 :System.out.print("единадесет");break;
                case 2 :System.out.print("дванадесет");break;
                case 3 :System.out.print("тринадесет");break;
                case 4 :System.out.print("четиринадесет");break;
                case 5 :System.out.print("петнадесет");break;
                case 6 :System.out.print("шестнадесет");break;
                case 7 :System.out.print("седемнадесет");break;
                case 8 :System.out.print("осемнадесет");break;
                case 9 :System.out.print("деветнадесет");break;
            }
        }
        if ( (a==0) && (b==0) && (c==0)) {
            System.out.println("Нула");
        }
    }
}
