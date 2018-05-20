package structural.decorator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Sandwich extends Food {
    @Override
    double get_cost() {

        return 25;
    }

    @Override
    String get_name() {

        description="SANDWICH";
        return description;
    }
}
