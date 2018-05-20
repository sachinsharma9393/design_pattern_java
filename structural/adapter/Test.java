package structural.adapter;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {
    public static void main(String[] args) {
        Strict_Teacher st=new Strict_Teacher();
        st.teaches();

        Mischevious_Student ms=new Mischevious_Student();
        Student_Adapter sa=new Student_Adapter(ms);
        sa.teaches();

    }
}
