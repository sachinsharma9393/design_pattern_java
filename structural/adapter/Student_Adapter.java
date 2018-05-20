package structural.adapter;

/**
 * Created by sachin on 5/5/2018.
 */
public class Student_Adapter implements Teacher {
    Student s;//whose adapter that acts as adaptee

    public Student_Adapter(Student s) {
        this.s=s;
    }

    @Override
    public void teaches() {
        s.study();
    }
}
