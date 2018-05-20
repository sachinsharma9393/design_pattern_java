package behavioral.state;

/**
 * Created by sachin on 5/5/2018.
 */
public class State_Context {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void tell_my_nature() {
       state.do_Something();
    }
}
