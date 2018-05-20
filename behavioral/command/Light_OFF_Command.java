package behavioral.command;

/**
 * Created by sachin on 5/6/2018.
 */
public class Light_OFF_Command implements Command {
    Reciever_Light rl;

    public Light_OFF_Command(Reciever_Light rl) {
        this.rl=rl;
    }

    @Override
    public void execute() {
        System.out.println("I AM FIRING LIGHT'S OFF COMMAND BUDDY!");
        rl.lights_Off();
    }
}
