package yanrui.DesignModel;

public class SingleModel1 {
    private static SingleModel1 instance;
    private SingleModel1(){

    }

    public static SingleModel1 getInstance(){
        if (instance == null)
            instance = new SingleModel1();
        return instance;
    }
}
