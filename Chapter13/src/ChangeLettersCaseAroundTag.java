/**
 * Created by vld62 on 4/9/17.
 * Даден е текст. Напишете програма, която променя регистъра на буквите
 на всички места в текста, заградени с таговете <upcase> и </upcase>.
 Таговете не могат да бъдат вложени.
 Пример:
 We are living in a <upcase>yellow submarine</upcase>. We don't
 have <upcase>anything</upcase> else.
 Резултат:
 We are living in a YELLOW SUBMARINE. We don't have ANYTHING else.
 */
public class ChangeLettersCaseAroundTag {

    public static void changeCase (String text) {
     int index1 = text.indexOf("<upcase>");
     int index2 = text.indexOf("</upcase>");
     String text3 = text.substring(index1+8,index2).toUpperCase();
     System.out.println("Index1 is: " + index1 + " Index2 is: " + index2 + " Text is: " + text3);
    }

    public static void main (String [] args) {
        String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
        changeCase(text);
    }
}
