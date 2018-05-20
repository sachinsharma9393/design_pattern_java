package behavioral.iterator;

import java.util.Iterator;

/**
 * Created by sachin on 5/5/2018.
 */
public class Test {
    public static void main(String[] args) {
        Node n1=new Node("sachin",10);
        Node n2=new Node("baba",9);
        Node n3=new Node("tejas",10);

        Graph g=new Graph();
        g.addNode(n1);
        g.addNode(n2);
        g.addNode(n3);

        Iterator<Node> nodes=g.my_iterator();
        System.out.println("DISPLAYING GRAPH WITH CUSTOM ITERATOR");
        while (nodes.hasNext())
        {
            Node retrieve =nodes.next();
            System.out.println(retrieve.name+"---"+retrieve.weight);
        }

    }
}
