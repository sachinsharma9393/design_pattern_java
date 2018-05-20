package creational.factory;

/**
 * Created by sachin on 5/5/2018.
 */
public class Cg_Factory {
   static Student s=null;
    public static Student find(String student) {
        //putting Mehod 1 code here ..
        //why it is done is to make all such modifications in this file if some changes happened better abstractions
        if(student.equals("Cg_btw6and7")||student.equals("6and7"))
        {
            s=new Cg_btw6and7();
        }
        else if(student.equals("Cg_greater_than7")||student.equals("greater than 7"))
        {
            s=new Cg_greater_than7();
        }
        else if(student.equals("Cg_greater_than8")||student.equals("greater than 8"))
        {
            s=new Cg_greater_than8();
        }
        else if(student.equals("Cg_lessthan6")||student.equals("less than 6"))
        {
            s=new Cg_lessthan6();

        }
        else {
            System.out.println("WRONG_INPUT");
            s=null;
        }
        /*if(s!=null)
            s.get_Quotes();*/


        return s;
    }
}
