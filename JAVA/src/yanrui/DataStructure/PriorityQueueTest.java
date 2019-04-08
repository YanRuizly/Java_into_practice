package yanrui.DataStructure;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    private static PriorityQueue<Integer> queue = new PriorityQueue<>();
    public static void main(String[] args){
        queue.add(6);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(7);
        queue.add(4);
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
