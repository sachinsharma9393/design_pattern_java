package structural.bridge;

/**
 * Created by sachin on 5/6/2018.
 */
public class Bridge_Class  extends Shape{//second method is to have a same 2 argument
    // constructor in Shape having  child types as well as color type
    Shape s;

    public Bridge_Class(Shape s) {
        super();
        this.s=s;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String get_Shape() {
        return null;
    }

    public void print_Property() {
        System.out.println("YOUR SHAPE IS " + s.get_Shape() + " and color is " + color.get_Color());
    }
}
