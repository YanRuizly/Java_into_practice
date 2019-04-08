package yanrui.DesignModel;

public class SingleModel2 {
    private static SingleModel2 instance;

    private SingleModel2(){

    }

    public static synchronized SingleModel2 getInstance(){
        if (instance == null)
            instance = new SingleModel2();
        return instance;
    }
}
