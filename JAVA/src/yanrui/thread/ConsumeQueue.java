package yanrui.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ConsumeQueue implements Runnable {
    private final BlockingDeque deque ;

    public ConsumeQueue(BlockingDeque deque){
        this.deque = deque;
    }

    @Override
    public void run(){
        try {
            for(int i = 0; i < 10; i++) {
                int x = (int) deque.take();
                System.out.println("消费了" + x);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
