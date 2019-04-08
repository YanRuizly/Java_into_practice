package yanrui.multThreads;

public class SequenceTest {
    public static void main(String[] args){
        LockObject object = new LockObject(0);
        Thread[] threads = new Thread[10];
        for (int i=0;i<=9;i++){
            threads[i] = new SequenceThread(object,i);
            threads[i].start();
        }
    }
}
