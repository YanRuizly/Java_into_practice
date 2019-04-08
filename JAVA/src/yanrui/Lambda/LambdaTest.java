package yanrui.Lambda;

public class LambdaTest {
    public static void main(String[] args){
        //Lambda 表达式都可以扩写为原始的“匿名类”形式
        Runnable noArguments = () -> System.out.println("Hello World");
        new Thread(noArguments).start();


        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };
        new Thread(multiStatement).start();

        new Thread( () -> System.out.println("In Java8, Lambda expression") ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("jdk1.7");
            }
        }).start();
    }
}
