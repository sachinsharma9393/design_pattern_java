package behavioral.strategy;

/**
 * Created by sachin on 5/4/2018.
 */
public class Test_Strategy {
    Student st;
    Test_Strategy(Student st)
    {
        this.st=st;
        //System.out.println(st.getClass());
    }

    void get_Placement_stats()
    {
        //finding weighted relation btw cg,placement_interview;
       double stats= st.get_Placement_Chance()*7+(st.get_CG()*.3);
        //assume stats when >5 is a very good chance of placement
        if(stats>6.3d)
        {
            System.out.println(st.get_Name()+"- YOU HAVE A VERY GOOD CHANCE WITH WEIGHTED **\t" + stats + "\t**");
        }
       else if(stats<5.0)
        {
            System.out.println(st.get_Name()+"- PLEASE WORK HARD WEIGHTED **\t" + stats + "\t**");
        }
        else {

            System.out.println(st.get_Name()+"- YOU ARE IN THE MIDDLE WORK HARD  WEIGHTED  **	" + stats + "\t**");
        }
    }


}
