package behavioral.strategy;

/**
 * Created by sachin on 5/4/2018.
 */
public class Student_cg_lessthan7 extends Student {
    String name;
     double placement_interview;
    double cg;

    Student_cg_lessthan7(String name, double placement_interview, double cg){
        this.placement_interview=placement_interview;
        this.name=name;
        this.cg=cg;
    }



    @Override
    public double get_Placement_Chance() {
        return placement_interview;
    }

    @Override
    public double get_CG() {
        return cg;
    }

    @Override
    public String get_Name() {
        return name;
    }
}
