package yanrui.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProduceConsumeTest {
    public static void main(String[] args){
        BlockingDeque deque = new LinkedBlockingDeque();
        Thread Producer = new Thread(new ProducerQueue(deque));
        Thread Consumer = new Thread(new ConsumeQueue(deque));
        Producer.start();
//        try {
//          //  Producer.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        Consumer.start();
    }
}
