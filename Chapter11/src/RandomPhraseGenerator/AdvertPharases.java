package RandomPhraseGenerator;
import java.util.Random;
/**
 * Created by viliev on 21.3.2017 г..
 */
public class AdvertPharases {

        public static String [] Expressions = {"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.",
                "Това е най-добрият продукт от тази категория."};
        public static String [] Experiences = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
                "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
        public static String [] AuthorFirstName = {"Диана", "Петя", "Стела", "Елена", "Катя"};
        public static String [] AuthorLastName = {"Иванова", "Петрова", "Кирова"};
        public static String [] Cities = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

        public static void phraseGenerator (){
            Random random = new Random();
            int expression = random.nextInt(Expressions.length);
            int experience = random.nextInt(Experiences.length);
            int firstName = random.nextInt(AuthorFirstName.length);
            int lastName = random.nextInt(AuthorLastName.length);
            int City = random.nextInt(Cities.length);

            System.out.print(Expressions[expression] + Experiences[experience] + "\n" + "-" + AuthorFirstName[firstName] +" "+AuthorLastName[lastName] + ", " + Cities[City]);
        }

}
