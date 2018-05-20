package structural.bridge;

/**
 * Created by sachin on 5/6/2018.
 */
public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    @Override
    public String get_Shape() {
        return "CIRCLE";
    }
}
