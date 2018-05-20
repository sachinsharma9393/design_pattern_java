package behavioral.state;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {
    public static void main(String[] args) {
State_Context state_context=new State_Context();
        //which behaviour
        Happy happy=new Happy();
        state_context.setState(happy);
        state_context.tell_my_nature();

        Sad sad=new Sad();
        state_context.setState(sad);
        state_context.tell_my_nature();

        Angry angry= new Angry();
        state_context.setState(angry);
        state_context.tell_my_nature();




    }
}
