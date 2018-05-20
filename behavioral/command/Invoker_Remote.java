package behavioral.command;

/**
 * Created by sachin on 5/6/2018.
 */
public class Invoker_Remote {
    Command c;

    public void control(Command c) {
        this.c=c;
    }

    public void press() {
        c.execute();
    }
}
