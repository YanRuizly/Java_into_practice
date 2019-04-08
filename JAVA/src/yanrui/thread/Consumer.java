package yanrui.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {
    private ArrayBlockingQueue queue;

    public Consumer(ArrayBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
//            Thread.currentThread().sleep(5000);
            //开始生产
            for (int i=0;i<10;i++){
                //System.out.println("开始消费");
                int taskNum = (int) queue.take();//会抛出异常
                System.out.println("消费了:" + String.valueOf(taskNum));
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
