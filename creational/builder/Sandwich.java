package creational.builder;

/**
 * Created by sachin on 5/6/2018.
 */
public class Sandwich {
    Bread b;
    Cheese c;
    Vegetables v;
    Sandwich(Bread b,Cheese c,Vegetables v)
    {
        this.b=b;
        this.c=c;
        this.v=v;

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "b=" + b +
                ", c=" + c +
                ", v=" + v +
                '}';
    }
}
