package yanrui.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest extends ReflectEntry{

    public static void getObjectMethod(){
        ReflectEntry entry = new ReflectTest();
        System.out.println(entry.getClass());
        System.out.println(ReflectEntry.class);

        //1.ClassTest.forName使用调用者的类加载器来加载
        //类加载的时候就执行静态代码块
        try {
            ReflectTest test = (ReflectTest)Class.forName("yanrui.Reflect.ReflectTest").newInstance();
            System.out.println(test.getClass());
        }catch (Exception e){
            e.printStackTrace();
        }

        //1..getClassLoader().loadClass  使用自定义的类加载器来加载
        //只用在netInstance的时候才会初始化静态代码块
        try {
            System.out.println(entry.getClass().getClassLoader().loadClass("yanrui.Reflect.ReflectTest"));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void Reflect(){
        ReflectEntry entry = new ReflectEntry();
        try {
            Field field1 = entry.getClass().getDeclaredField("field1");
            Field field2 = entry.getClass().getDeclaredField("field2");
            Field field3 = entry.getClass().getDeclaredField("field3");
            field1.setAccessible(true);
            field2.setAccessible(true);
            System.out.println(field1.get(entry));
            System.out.println(field2.get(entry));
            System.out.println(field3.get(entry));

            //另外一种获得类的方法
            Method method1 = ReflectEntry.class.getDeclaredMethod("func1");
            method1.setAccessible(true);
            //调用这个方法
            method1.invoke(entry);
            Method method2 = ReflectEntry.class.getDeclaredMethod("func2");
            //method2.setAccessible(true);
            method2.invoke(entry);

            Class class1 = ReflectEntry.class;
            Class class2 = entry.getClass();
            ClassLoader loader = entry.getClass().getClassLoader();
            Class class3 = loader.loadClass("yanrui.Reflect.ReflectEntry");
            System.out.println(class1);
            System.out.println(class2);
            System.out.println(class3);
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }



    public static void main(String[] args){
        //获取类对象的方法
        getObjectMethod();

        Reflect();
    }
}
