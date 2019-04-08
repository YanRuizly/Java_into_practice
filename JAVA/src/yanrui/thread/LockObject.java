package yanrui.thread;

public class LockObject {
    int orderNum=0;
    int MaxValue=9;

    public LockObject(int orderNum,int maxValue) {
        this.orderNum = orderNum;
        this.MaxValue = maxValue;
    }
}
