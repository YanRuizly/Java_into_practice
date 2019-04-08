package yanrui.multThreads;

public class LockObject {
    int orderNum = 0;
    final static int maxValue = 9;
    public LockObject(int orderNum){
        this.orderNum = orderNum;
    }
}
