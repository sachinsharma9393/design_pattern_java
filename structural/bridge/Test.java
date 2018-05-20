package structural.bridge;

/**
 * Created by sachin on 5/6/2018.
 */
public class Test {
    public static void main(String[] args) {
        /*
        //Method-1
        Rectangle r=new Rectangle();
        Bridge_Class d=new Bridge_Class(r);
        d.setColor(new Red_Color());
        d.print_Property();


        d=new Bridge_Class(new Circle());
        d.setColor(new Blue_Color());
        d.print_Property();*/

        //m-2 implementation without using unnecessary bridge class

        Shape r=new Rectangle(new Red_Color());
        System.out.println(r.get_Shape());


    }

}
