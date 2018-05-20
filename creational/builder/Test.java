package creational.builder;

/**
 * Created by sachin on 5/6/2018.
 */
public class Test {
    public static void main(String[] args) {
        //traditional way of creating object
        System.out.println("CONVENTIONAL _IMPLEMENTATION");
        Sandwich s=new Sandwich(new Bread(),new Cheese(),new Vegetables());
        System.out.println(s);

        //but problem with this approach is when complex object is passed as an argument
        //it is becomed difficult for ordering

        //so as to deal with such problem builder pattern is used

        System.out.println("****SANDWICH USING BUILDER ****");
        SandwichBuilder sb=new SandwichBuilder();
        System.out.println(sb.setB(new Bread()).sandwich_maker());
        //this is the benefit no need to pass all constructor values or in the order ....if values not passed,default is taken



    }
}
