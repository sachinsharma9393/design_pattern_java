package structural.composite;

/**
 * Created by sachin on 5/5/2018.
 */
public class File extends File_Dir {
    String name;
    public File(String name) {
        this.name=name;
    }


    @Override
    public void ls() {


    }

    @Override
    public String getName() {
        return name;
    }
}
