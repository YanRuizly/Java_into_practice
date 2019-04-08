package yanrui.thread;

public class MyThread1 extends Thread{
    //1、定义需要传入的LockObject对象
    private LockObject lobject;


    //2、定义属于线程自己的打印数字
    private int printNum =0;


    public MyThread1(LockObject lobject,int printNum){
        this.lobject=lobject;
        this.printNum = printNum;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //1、判断该资源是否被占用
        synchronized(lobject){
            //2、如果资源空闲，则判断是否已经打印完成
            while(lobject.orderNum <= lobject.MaxValue){
                //3、没有打印完则判断是否是自己需要打印的数字
                if(lobject.orderNum == printNum){
                    System.out.print(printNum);
                    lobject.orderNum++;
                    if(lobject.orderNum==10){
                        System.out.println("线程打印完毕");
                    }

                    //打印完毕后，唤醒所有的线程
                    lobject.notifyAll();
                }else{
                    //4、不是该线程打印的数字，则继续等待
                    try {
                        lobject.wait();
                        //System.out.println("线程等待 "+printNum);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        System.out.println("线程" + printNum + "被打断了");
                        e.printStackTrace();
                    }

                }

            }
        }

    }
}
