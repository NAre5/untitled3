import java.io.IOException;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
        Stack tagans_ki=new Stack();
        List eran1=new ArrayList();
        eran1.add(5);
        eran1.add("steven was right");
        for(Object x : eran1)
            System.out.println(x);
        Collections.synchronizedList(eran1);
        Integer eran=0;
        Integer steven=100;
        System.out.println(eran);
        System.out.println(steven);
        System.out.println("......");
        swap(eran,steven);
        System.out.println("......");
        System.out.println(eran);
        System.out.println(steven);
    }

    private static void swap(Integer eran, Integer steven) {
        System.out.println(eran);
        System.out.println(steven);
        Integer tmp=eran;
        eran=steven;
        steven=tmp;
        System.out.println(eran);
        System.out.println(steven);
    }

}

class Testt extends Thread{
    String s;

    public Testt(String s) {
        this.s = s;
    }
    public void inc(int num)
    {}
}