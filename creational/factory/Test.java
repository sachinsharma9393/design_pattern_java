package creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        //here we need object creation at runtime
        //take input from user
        Student s=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER CORRECT CG RANGE ");
        String student=br.readLine();/*

        //METHOD 1
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
        if(s!=null)
        s.get_Quotes();
*/

        //METHOD 2 IS MAKING FACTORY CLASS THROUGH WHICH PUTTING ALL THIS STUFF IN DIFF CLASS,,,for evry such runtime categories
        //have some adapet rather than populating 1 main class,get there objects through factory class and manipulate in this class

           s= Cg_Factory.find(student);

 if(s!=null)
            s.get_Quotes();
    }
}
