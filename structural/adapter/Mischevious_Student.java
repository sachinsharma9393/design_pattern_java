package structural.adapter;

/**
 * Created by sachin on 5/5/2018.
 */
public class Mischevious_Student implements Student {
    @Override
    public void study() {
        System.out.println("DO EVERYTHING EXCEPT STUDY :)");
    }
  public void  get_Me()
    {
        System.out.println("HELL MISCHEVIOUS!!!");

    }
}
