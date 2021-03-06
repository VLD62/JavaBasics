package RandomPhraseGenerator;
import RandomPhraseGenerator.AdvertPharases;

import java.util.Scanner;

/**
 * Created by viliev on 21.3.2017 г..
 * 5. Напишете програма, която генерира случайно рекламно съобщение за някакъв продукт.
 * Съобщенията трябва да се състоят от хвалебствена фраза, следвани от хвалебствена случка, следвани от автор (първо и второ име) и град,
 * които се избират от предварително подготвени списъци. Например, нека имаме следните списъци:
 - Хвалебствени фрази: {"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."}.
 - Хвалебствени случки: {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."}.
 - Първо име на автор: {"Диана", "Петя", "Стела", "Елена", "Катя"}.
 - Второ име на автор: {"Иванова", "Петрова", "Кирова"}.
 - Градове: {"София", "Пловдив", "Варна", "Русе", "Бургас"}.
 Тогава програма би могла да изведе следното случайно-генерирано рекламно съобщение:
 Постоянно ползвам този продукт. Опитайте и вие. Аз съм доволна. -– Елена Петрова, Варна
 */
public class GenerateRandomPhrase{

    public static void main (String [] Args) {
        int N;
        Scanner in = new Scanner(System.in);
        System.out.print("Please select option for random phrase generation: \n" + "1. Advertisement. \n" + "2. Bad words about computer.\n");
        N = in.nextInt();

        if ( N != 1 && N !=2) {
            System.out.println("Please select options only 1 and 2!");
        } else {

            if (N == 1) {
                AdvertPharases.phraseGenerator();
            } else {
                BadWordPharases.phraseGenerator();
            }

        }




    }
}
