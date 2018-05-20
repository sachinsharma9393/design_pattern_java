package structural.decorator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Cheese extends Extra_Decorator {
    Food f;//each decorator concrete component has a reference to original food component

    public Cheese(Food f) {
        this.f=f;
    }

    @Override
    double get_cost() {
        return 25+f.get_cost();
    }

    @Override
    String get_name() {
        description_decorator="CHEESE";
        return f.get_name()+" WITH EXTRA "+description_decorator+" ";
    }




}
