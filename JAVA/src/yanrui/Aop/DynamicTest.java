package yanrui.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new DynamicProxy(realSubject);
        Subject subject =  (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);
        subject.hello();
        subject.bye();


        SubjectNew subjectNew = new RealSubject();
        InvocationHandler handler1 = new DynamicProxy(subjectNew);
        SubjectNew subjectNew1 = (SubjectNew) Proxy.newProxyInstance(handler1.getClass().getClassLoader(), subjectNew
                .getClass().getInterfaces(), handler);
        subjectNew1.helloNew();
        subjectNew1.byeNew();


    }
}
