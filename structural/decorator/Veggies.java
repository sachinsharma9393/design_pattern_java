package structural.decorator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Veggies extends Extra_Decorator {
    Food f;

    public Veggies(Food f) {
        this.f =f;
    }

    @Override
    double get_cost() {
        return 15+f.get_cost();
    }

    @Override
    String get_name() {
        description_decorator="VEGGIES";
        return f.get_name()+" WITH EXTRA "+description_decorator;
    }
}
