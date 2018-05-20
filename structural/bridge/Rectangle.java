package structural.bridge;

/**
 * Created by sachin on 5/6/2018.
 */
public class Rectangle extends Shape {
    public Rectangle(Color red_color) {
        super(red_color);

    }

    @Override
    public String get_Shape() {


        return color.get_Color()+" color RECTANGLE";
    }
}
