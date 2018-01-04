package assignment;
import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue{
    private ArrayList list[];
    private int size;
    
    public LinkedPriorityQueue(int s){
        size = s;
        list = new ArrayList[size];
        for (int x = 0; x < size; x++) {
            list[x] = new ArrayList();
        }
    }

     @Override
    public void enqueue(Object o, int priority) {
        list[priority].add(o);
    }

    @Override
    public Object peekFront() {        
        for (int i = 0; i < list.length; i++) {
            if(list[i].size()>0)
                return list[i].get(0);
        }
        return "No patients";
    }

    @Override
    public Object dequeue() {
        for (int i = 0; i < list.length; i++) {
            if(list[i].size()>0)
                return list[i].remove(0);
        }
        throw new IllegalStateException("Queue is empty");
    }
    
    @Override
    public void enqueue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return list.length; //number of priorities
    }
    
    public int queueSize(int i){
        
        return list[i].size();
    }

    public boolean hasData() {
        boolean answer=false;
        for (int i = 0; i < list.length; i++) {
            if(list[i].size()>0) return true;
        }
        return false;

    }
}
