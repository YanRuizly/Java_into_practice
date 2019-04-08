package yanrui.Lock;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public AtomicInteger inc = new AtomicInteger();

    public void increase(){
        inc.getAndIncrement();
    }

    public static void main(String[] args){
        final AtomicTest test = new AtomicTest();
        for (int i=0;i<10;i++){
            new Thread(){
                public void run(){
                    for(int j=0;j<100;j++){
                        test.increase();
                    }
                }
            }.start();
        }
       // while (Thread.activeCount() > 1){
       //     Thread.yield();
      //  }
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(test.inc);
    }
}
