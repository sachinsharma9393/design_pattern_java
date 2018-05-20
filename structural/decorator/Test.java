package structural.decorator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {
    public static void main(String[] args) {
        Food g=new Burger();
        System.out.println(g.get_name());

        Food f=new Sandwich();
        f=new Cheese(f);
        f=new Veggies(f);
        System.out.println(f.get_cost() + "====dish is " + f.get_name());

        //say i need both sandwich + burger with extra cheese in both

        //this will difference btw decorator and composite ....composite would have added everything
        //but decorator is designed to add main with many decoarting subclasses
        Food comp=new Sandwich();
        comp=new Cheese(comp);
        comp=new Burger();
        comp=new Cheese(comp);


        System.out.println(comp.get_name());
        System.out.println("COMBO COST IS "+comp.get_cost());

    }
}

