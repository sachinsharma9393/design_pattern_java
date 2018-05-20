package structural.decorator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Burger extends Food {

    @Override
    double get_cost() {

        return 15;
    }

    @Override
    String get_name() {

        description="BURGER";
        return description;
    }
}
