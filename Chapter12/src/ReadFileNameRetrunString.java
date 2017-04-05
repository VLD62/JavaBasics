import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Created by viliev on 5.4.2017 г..
 * Напишете метод, който приема като параметър име на текстов файл и прочита съдържанието му и го връща като String.
 */
public class ReadFileNameRetrunString {
    public static void main (String [] args) {
        String filename, line;
        Scanner in = new Scanner(System.in);
        Scanner fileScanner;
        System.out.println("Enter filename of txt file: ");
        filename = "C:\\Users\\viliev\\Desktop"+"\\" + in.nextLine();
        System.out.println("Entered filename is: " + filename);
        File f = new File(filename);
        try {
            fileScanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exists.");
            return;
        }
        while (fileScanner.hasNextLine()) {
            line = fileScanner.nextLine();
            System.out.println(line);
        }
        fileScanner.close();
    }
}
