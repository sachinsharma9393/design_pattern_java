package structural.adapter;

/**
 * Created by sachin on 5/5/2018.
 */
public class Serious_Student implements Student {

    @Override
    public void study() {
        System.out.println("I STUDY A LOT ");
    }
    public void get_Me()
    {
        System.out.println("SERIOUS!!!!");

    }
}
