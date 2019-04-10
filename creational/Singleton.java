

public class T1 {
    public static void main(String[] args) {
        Singleton si=Singleton.getS1();//sync fun
        Singleton s2=Singleton.getS1syncblock();//sync block
        si.service();
    }

}
class Singleton
{
     static Singleton s1;
    private Singleton(){};
    //locking for sync block
   static Object lock=new Object();
    void service(){
        System.out.println("accessing service of singleton");
    }
    static synchronized Singleton getS1()
    {
        if (s1==null)return new Singleton();
        else
            return s1;
    }
    static Singleton getS1syncblock()
    {

       /* if(s1==null)
        {
            synchronized (lock)
            {
                s1=new Singleton();
            }
        }*/
       Singleton temp=s1;
       if(temp==null)
       {
           synchronized (lock)
           {
               if (s1==null)
               {
                temp=   s1=new Singleton();
               }
           }
       }
        return s1;
    }
}

