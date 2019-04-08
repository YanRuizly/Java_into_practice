package yanrui.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest extends Thread {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void LockTest(){
        try
        {
            lock.lock();
            System.out.println("await时间为：" + System.currentTimeMillis());
            condition.await();
            System.out.println("await等待结束");
            for (int i = 0; i < 2; i++)
            {
                System.out.println("ThreadName = " + Thread.currentThread().getName() +
                        ", i  = " + i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void signal()
    {
        try
        {
            lock.lock();
            System.out.println("signal时间为：" + System.currentTimeMillis());
            condition.signal();
        }
        finally
        {
            lock.unlock();
        }
    }

    @Override
    public void run(){
        LockTest();
    }

    public static void main(String[] args) {
        ReentrantLockTest mt0 = new ReentrantLockTest();
        ReentrantLockTest mt1 = new ReentrantLockTest();
        ReentrantLockTest mt2 = new ReentrantLockTest();
        mt0.start();
        mt0.signal();
        mt1.start();
        mt2.start();
    }
}
