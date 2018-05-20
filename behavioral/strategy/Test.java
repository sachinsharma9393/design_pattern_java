package behavioral.strategy;

/**
 * Created by sachin on 5/4/2018.
 */
public class Test {
    public static void main(String[] args) {
        Student_cg_btw_78 a=new Student_cg_btw_78(" MR. A ",.6d,7.5d);//.6 is placement interview prep out of 1
        Test_Strategy tst=new Test_Strategy(a);
        tst.get_Placement_stats();


        Student_cg_greaterthan_8 b=new Student_cg_greaterthan_8(" MR. B ",.5d,8.5);//.5 is placement interview prep out of 1
        tst=new Test_Strategy(b);
        tst.get_Placement_stats();

        Student_cg_lessthan7 c=new Student_cg_lessthan7("MR. C ",.6d,6.4d);//.6 is placement interview prep out of 1
        tst=new Test_Strategy(c);
        tst.get_Placement_stats();

    }
}
