/**
 * Created by vld62 on 2/12/17.
 */
import java.util.Scanner;
public class Excersise9 {
    public static void main (String [] args){
        /*Фирма, занимаваща се с маркетинг, иска да пази запис с данни на
нейните служители. Всеки запис трябва да има следната характеристика
– първо име, фамилия, възраст, пол (м или ж), ID номер и уникален
номер на служителя (27560000 до 27569999). Декларирайте
необходимите променливи, нужни за да се запази информацията за
един служител, като използвате подходящи типове данни и описателни
имена.*/
        String firstName;
        String lastName;
        char genre;
        int id;
        long uid;
        Scanner in = new Scanner(System.in);
        //Set firstName
        System.out.println("Please type First Name: ");
        firstName = in.nextLine();
        System.out.println("Please type Last Name: ");
        lastName = in.nextLine();
        System.out.println("Please enter genre: ");
        genre = in.nextLine().charAt(0);
        System.out.println("Please enter id (numerical value): ");
        id = in.nextInt();
        System.out.println("Please enter uid (numerical value): ");
        uid = in.nextInt();

        //Show final all details:
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("genre is: " + genre);
        System.out.println("id name is: " + id);
        System.out.println("uid name is: " + uid);

    }
}
