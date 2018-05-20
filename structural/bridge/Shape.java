package structural.bridge;

/**
 * Created by sachin on 5/6/2018.
 */
public abstract class Shape {
    Color color;

    Shape(Color color)
    {
        this.color=color;
    }

    public Shape() {

    }

    public abstract String get_Shape();
}
