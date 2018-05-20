package creational.builder;

/**
 * Created by sachin on 5/6/2018.
 */
public class SandwichBuilder {
    Bread b;
    Cheese c;
    Vegetables v;

    public SandwichBuilder setB(Bread b) {
        this.b = b;
        return this;
    }

    public SandwichBuilder setC(Cheese c) {
        this.c = c;
        return this;
    }

    public SandwichBuilder setV(Vegetables v) {
        this.v = v;
        return this;
    }

    public Sandwich sandwich_maker()
    {
        return new Sandwich(b,c,v);
    }
}
