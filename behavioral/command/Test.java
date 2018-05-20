package behavioral.command;

/**
 * Created by sachin on 5/6/2018.
 */
public class Test {

    public static void main(String[] args) {
        //first create invoker and reciever
        Reciever_Light reciever_light=new Reciever_Light();
        Invoker_Remote invoker_remote=new Invoker_Remote();
        //now we should know  the commands to be provided and on whom these commands to be made
        //here commands are on reciever which is light

        Light_ON_Command on_command=new Light_ON_Command(reciever_light);
        Light_OFF_Command  off_command=new Light_OFF_Command(reciever_light);

        //now i will give this on off command to remote control which internally has reciever light on which commands get fired
        invoker_remote.control(on_command);
        //now lets press button

        invoker_remote.press();

        invoker_remote.control(off_command);
        invoker_remote.press();
    }



}
