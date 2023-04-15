package Practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args){

        Queue<String> myQueue = new PriorityQueue<>();

        myQueue.add("Bhavani");
        myQueue.add("Subhash");
        myQueue.add("Rathod");

        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.peek();
        System.out.println(myQueue);

        String head = myQueue.poll();
        System.out.println(head);

        System.out.println(myQueue);

    }

}
