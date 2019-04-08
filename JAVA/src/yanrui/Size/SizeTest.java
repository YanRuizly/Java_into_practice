package yanrui.Size;

import java.lang.instrument.Instrumentation;

public class SizeTest {
    private static volatile Instrumentation instru;
    public static void premain(String args, Instrumentation inst) {
        instru = inst;
    }
    public static Long getSizeOf(Object object) {
        if (instru == null) {
            throw new IllegalStateException("Instrumentation is null");
        }
        return instru.getObjectSize(object);
    }

    public static void main(String[] args){
        SizeTest sizeTest = new SizeTest();
        System.out.println(getSizeOf(sizeTest));
    }
}
