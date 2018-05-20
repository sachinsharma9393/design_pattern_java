package behavioral.iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by sachin on 5/5/2018.
 */
public class Graph {
    Vector<Node>list;
    Graph()
    {
        list=new Vector<>();

    }

    public void addNode(Node n1) {
        list.add(n1);
    }

    public Iterator<Node> my_iterator() {
        return list.iterator();
    }

    class Node_Iterator implements Iterator
    {
        int position=0;

        @Override
        public boolean hasNext() {
            if(position>=list.size())
            return false;
            else return true;
        }

        @Override
        public Node next() {
            return list.get(position++);
        }
    }
}
