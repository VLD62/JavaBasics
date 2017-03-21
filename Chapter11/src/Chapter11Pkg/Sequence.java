package Chapter11Pkg;

/**
 * Created by viliev on 21.3.2017 г..
 */
public class Sequence {
    // Static field
    public static int currentValue = -1;
    // Intentionally deny instantiation of this class
    public Sequence() {
    }
    // Static method
    public static int nextValue() {
        currentValue++;

        return currentValue;
    }
}
