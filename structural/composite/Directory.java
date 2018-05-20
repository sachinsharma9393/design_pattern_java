package structural.composite;

import java.util.Vector;

/**
 * Created by sachin on 5/5/2018.
 */
public class Directory extends File_Dir {
    Vector<File_Dir>fd;
    String name;
    public Directory(String name) {
        this.name=name;
        fd=new Vector<>();
    }

    @Override
    public void ls() {
        for (int i = 0; i < fd.size(); i++) {
            if(fd.get(i).getClass()==File.class)
            {
                System.out.println("FILE IS " + fd.get(i).getName());
            }
            else {
                System.out.println("GOT A DIRECTORY IN " + fd.get(i).getName());
                fd.get(i).ls();
            }
        }

    }

    @Override
    public String getName() {
        return name;
    }

    public void add(File_Dir component) {
        fd.add(component);
    }
}
