package yanrui.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {
    private int taskNum;
    private ArrayBlockingQueue queue;

    public Producer(int taskNum, ArrayBlockingQueue queue){
        this.taskNum = taskNum;
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
            Thread.currentThread().sleep(5000);
            //开始生产
            System.out.println("开始生产");
            queue.add(taskNum);//会抛出异常
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
