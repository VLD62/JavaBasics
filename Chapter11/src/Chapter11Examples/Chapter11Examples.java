package Chapter11Examples;
import Chapter11Pkg.Cat;
import Chapter11Pkg.Sequence;
/**
 * Created by viliev on 21.3.2017 г..
 */
public class Chapter11Examples {
    public static void main (String [] Args) {
        Cat GoshoCat = new Cat("Gosho", "black");
        System.out.println("Cat`s name is " + GoshoCat.name + ", color of this cat is " + GoshoCat.color +".");
        new Sequence();
        System.out.println("Sequence is of 3 is: " + " " + Sequence.nextValue() + " " + Sequence.nextValue() + " " + Sequence.nextValue() + ".");
    }
}
