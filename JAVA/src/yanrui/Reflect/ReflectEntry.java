package yanrui.Reflect;

public class ReflectEntry {
    private String field1 = "私有属性field1";
    private String field2 = "私有属性field2";
    public  String field3 = "共有属性field3";

    private void func1(){
        System.out.println("私有方法func1");
    }

    public void func2(){
        System.out.println("共有方法func2");
    }
}
