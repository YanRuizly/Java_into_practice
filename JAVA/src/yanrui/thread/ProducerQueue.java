package yanrui.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerQueue implements Runnable {
    private final BlockingDeque deque ;

    public ProducerQueue(BlockingDeque deque){
        this.deque = deque;
    }

    @Override
    public void run(){
        try {
            for (int i=1;i<10;i++){
                System.out.println("生产了"+i);
                deque.put(i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
