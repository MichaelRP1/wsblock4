package quarter4;
import java.util.ArrayList;

public class MyQueueAssignment {
    ArrayList<String> alist = new ArrayList<>();

    public MyQueueAssignment() {

    }

    public void enqueue(String i) {
        alist.add(i);
    }

    public String dequeue() {
        if (alist.size() == 0) {
            return null;
        } else {
            String r = alist.remove(0);
            return r;
        }
    }

    public String peek() {
        if (alist.size() == 0) {
            return null;
        } else {
            String r = alist.get(0);
            return r;
        }
    }

    public boolean empty() {
        if (alist.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void removeAll() {
        alist.clear();
    }

    public String toString() {
        return alist.toString();
    }

    public int size() {
        return alist.size();
    }

    public static void main(String args[]) {
        MyQueueAssignment queue = new MyQueueAssignment();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");
        queue.enqueue("7");
        queue.enqueue("8");
        queue.enqueue("9");
        queue.enqueue("10");

        System.out.println(queue.size());
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}