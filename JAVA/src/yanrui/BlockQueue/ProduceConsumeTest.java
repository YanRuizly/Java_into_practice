package yanrui.BlockQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProduceConsumeTest {
    public static void main(String[] args){
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
        queue.add(1);
        queue.offer(1);
    }
}
