package RandomPhraseGenerator;
import javax.swing.*;
import java.util.Random;

/**
 * Created by viliev on 21.3.2017 г..
 */
public class BadWordPharases {

        public static String [] Actions  = {"Ще ядеш бой.", "Ще ти потроша мониторчето.", "Ще те залея с вода!",
                "Взимам брадвата и те права на болченца."};
        public static String [] Experiences = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
                "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
        public static String [] Adjectives = {"Гаден", "Долен", "Мръсен", "Бавен", "Ретардски"};
        public static String [] Nouns = {"боклук", "камаз", "помярник"};

        public static void phraseGenerator (){
            Random random = new Random();
            int action = random.nextInt(Actions.length);
            int experience = random.nextInt(Experiences.length);
            int adj = random.nextInt(Adjectives.length);
            int noun = random.nextInt(Nouns.length);

            System.out.print(Actions[action] +" " + Adjectives[adj] +" "+ Nouns[noun] +"." + "\n" +  Experiences[experience] );
        }

}
