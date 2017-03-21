package Chapter11Pkg;

/**
 * Created by viliev on 21.3.2017 г..
 */
public class Cat {

    // Field name
    public String name;
    // Field color
    public String color;

    // Default constructor
    public Cat() {
        this.name = "Unnamed";
        this.color = "gray";
    }
    // Constructor with parameters
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }


}
