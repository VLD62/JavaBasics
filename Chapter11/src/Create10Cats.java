import Chapter11Pkg.Cat;
/**
 * Created by viliev on 21.3.2017 г..
 * Напишете програма, която създава 10 обекта от тип Cat, дава им имена от вида CatN,
 * където N e уникален пореден номер на обекта, и накрая извиква метода sayMiau() на всеки от тях.
 * За реализацията използвайте вече дефинирания пакет chapter10.
 */
public class Create10Cats {

    public static void main (String [] Args) {
        for (int i = 1; i < 11; i++) {
            Cat CatN = new Cat("Cat"+i, "black");
            System.out.println("Cat`s name is: " + CatN.name);
            CatN.sayMiau();
        }
    }
}
