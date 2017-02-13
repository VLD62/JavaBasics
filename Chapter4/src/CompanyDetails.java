/**
 * Created by vld62 on 2/13/17.
 */
import java.util.Scanner;
public class CompanyDetails {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter company name:");
        String CompanyName = in.nextLine();
        System.out.println("Please enter company address:");
        String CompanyAddress = in.nextLine();
        System.out.println("Please enter company phone number:");
        String CompanyPhone = in.nextLine();
        System.out.println("Please enter company website:");
        String CompanyWeb = in.nextLine();
        System.out.println("Please enter manager first name:");
        String managerFirstName = in.nextLine();
        System.out.println("Please enter manager last name:");
        String managerLastName = in.nextLine();
        System.out.println("Please enter manager phone number:");
        String managerPhone = in.nextLine();
        System.out.print("Company is " + CompanyName + "\n" +
        "Address : " + CompanyAddress +"\n" +
        "Phone : " + CompanyPhone +"\n" +
        "Website : " + CompanyWeb + "\n" +
        "Manager is: " + managerFirstName + " " + managerLastName + " , phone : " + managerPhone + " .");
    }

}
