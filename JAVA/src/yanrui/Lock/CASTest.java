package yanrui.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CASTest {

    static int i=0;
    private static Lock lock = new ReentrantLock();

    /*
    public synchronized static void add(){
        i++;
    }
    */
    public static void add(){
        lock.lock();
        i++;
        lock.unlock();
    }

    public static class Plus implements Runnable{
        @Override
        public void run(){
            for (int k=0;k<10000;k++){
                add();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            threads[i] = new Thread(new Plus());
            threads[i].start();
        }

        for(int i=0;i<10;i++){
            threads[i].join();
        }
        System.out.println(i);
    }
}
