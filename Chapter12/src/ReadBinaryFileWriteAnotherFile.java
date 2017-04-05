import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
import java.io.FileOutputStream;


/**
 * Created by viliev on 5.4.2017 г..
 * Напишете метод, който приема като параметър име на бинарен файл и прочита съдържанието на файла и го връща като масив от байтове.
 * Напишете метод, който записва прочетеното съдържание в друг файл.
 */
public class ReadBinaryFileWriteAnotherFile {
    public static  byte[] data;
    //Building new file
    public  static  void fileBuilder (byte[] data) {
        String filename, pathname;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter new filename: ");
        filename = in.nextLine();
        pathname = "C:\\Users\\viliev\\Desktop"+"\\" + filename ;
        Path path = Paths.get(pathname);
        try {
            Files.write(path, data);
        } catch (IOException e) {
        }
        System.out.println("New file was created in: " + pathname);

    }
    //Reads bytes from input file
    public static byte[] fileReader (String filepath)  {

        Path path = Paths.get(filepath);
        try {
          data = Files.readAllBytes(path);
        } catch (IOException e) {
        }
        return data;

    }

    public static void main (String [] args) {
        String filename, line;
        Scanner in = new Scanner(System.in);
        Scanner fileScanner;
        System.out.println("Enter filename of binary file: ");
        filename = "C:\\Users\\viliev\\Desktop"+"\\" + in.nextLine();
        System.out.println("Entered filename is: " + filename);
        File f = new File(filename);

        try {
            fileScanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exists.");
            return;
        }
        //Call file reader
        fileReader(filename);
        //Call file builder
        fileBuilder(data);
        /*/
        StringBuilder str = new StringBuilder();
        //
        /////////////////////
        System.out.println("Content of file is");
        while (fileScanner.hasNextLine()) {
            line = fileScanner.nextLine();
            System.out.println(line);
            str.append(line);
        }
        fileScanner.close();
        System.out.print("Builded string is: " + str);
        //////////////////*/

    }
}
