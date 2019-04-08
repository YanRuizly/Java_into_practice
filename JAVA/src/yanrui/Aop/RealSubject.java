package yanrui.Aop;

public class RealSubject implements Subject,SubjectNew{
    public void hello(){
        System.out.println("hello my name is yr");
    }
    public void bye(){
        System.out.println("bye bye");
    }

    public void helloNew(){
        System.out.println("hellonew my name is yr");
    }
    public void byeNew(){
        System.out.println("byenew bye");
    }
}
