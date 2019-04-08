package yanrui.Lock;

public class DeathLock {
    final static Object lockA = "obj1";
    final static Object lockB = "obj2";

    //静态内部类
    static class ThreadA extends Thread{
        public void run(){
            synchronized(lockA){
                System.out.println("Lock A,want B");
                synchronized (lockB){
                    System.out.println("Lock B");
                }
            }
        }
    }

    //静态内部类
    static class ThreadB extends Thread{
        public void run(){
            synchronized(lockB){
                System.out.println("Lock B,want A");
                synchronized (lockA){
                    System.out.println("Lock A");
                }
            }
        }
    }

    public static void main(String[] args){
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}


