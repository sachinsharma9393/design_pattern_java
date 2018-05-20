package structural.composite;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {
    public static void main(String[] args) {
        Directory c_drive=new Directory("C-DRIVE");
        Directory d_drive=new Directory("D-DRIVE");
        Directory e_drive=new Directory("E-DRIVE");

        File a=new File("a.cpp");
        File b=new File("b.java");
        File c=new File("c.cs");
        File d=new File("d.jpeg");
        File e=new File("e.java");

        File f=new File("f.docx");

        File g=new File("g.rtf");

        Directory imp=new Directory("temp");
        Directory new_t=new Directory("new_t");


        c_drive.add(a);c_drive.add(b);c_drive.add(c);c_drive.add(imp);
        imp.add(c);imp.add(e);

        d_drive.add(d);d_drive.add(e);c_drive.add(f);c_drive.add(new_t);
        e_drive.add(imp);e_drive.add(g);

        System.out.println("PRINTING C_DRIVE");
        c_drive.ls();
        System.out.println("PRINTING D_DRIVE");
        c_drive.ls();
        System.out.println("PRINTING E_DRIVE");
        e_drive.ls();


    }
}
