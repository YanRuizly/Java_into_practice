package yanrui.multThreads;

public class SequenceThread extends Thread{
    private LockObject lockObject;
    //2、定义属于线程自己的打印数字
    private int printNum =0;


    public SequenceThread(LockObject lobject,int printNum){
        this.lockObject = lobject;
        this.printNum = printNum;
    }
    @Override
    public void run(){
        synchronized (lockObject){
            while (lockObject.orderNum <= lockObject.maxValue){
                if(lockObject.orderNum == printNum){
                    System.out.println(printNum);
                    lockObject.orderNum++;
                    if(lockObject.orderNum == 10)
                        System.out.println("线程打印完毕");
                    lockObject.notifyAll();
                }
                else {
                    try {
                        lockObject.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        System.out.println("发生了中断");
                    }
                }
            }
        }
    }
}
