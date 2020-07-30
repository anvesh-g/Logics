package src.com.set_1.go.codefaqs.code2;

public class Test2 extends Test1 {
    public void m1(){
        System.out.println("m1 in Test2");
    }

    public void m2(){
        super.m2();
        System.out.println("m2 in Test2");
    }
}
