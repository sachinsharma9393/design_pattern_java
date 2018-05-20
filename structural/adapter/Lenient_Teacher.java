package structural.adapter;

/**
 * Created by sachin on 5/5/2018.
 */
public class Lenient_Teacher implements Teacher {
    @Override
    public void teaches() {
        System.out.println(" I AM LENIENT ");
    }
}
