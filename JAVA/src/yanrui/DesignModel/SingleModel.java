package yanrui.DesignModel;

public class SingleModel {
    private  static SingleModel instance = new SingleModel();
    private SingleModel(){

    }

    public static SingleModel getInstance(){
        return instance;
    }
}
