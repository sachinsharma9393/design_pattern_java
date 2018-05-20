package behavioral.command;

/**
 * Created by sachin on 5/6/2018.
 */
public class Light_ON_Command implements Command {
    Reciever_Light rl;

    public Light_ON_Command(Reciever_Light rl) {
    this.rl=rl;
    }


    @Override
    public void execute() {
        System.out.println("I AM FIRING LIGHTS ON COMMAND BUDDY !!");
        rl.lights_On();
    }
}
