package yanrui.JUC;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    static final CountDownLatch latch = new CountDownLatch(2);

    public static class MyThread extends Thread{
        @Override
        public void run(){
            try{
                System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                Thread.sleep(3000);
                System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                latch.countDown();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        try {
            System.out.println("等待两个子线程执行完毕...");
            latch.await();
            System.out.println("两个子线程执行完毕");
            System.out.println("继续执行主线程");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
