package src.com.set_1.go.codefaqs.code2;

public class Driver {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.m1();
        t1.m2();

        Test1 t2=new Test2();
        t2.m1();
        t2.m2();


        Test2 t3=new Test2();
        t3.m1();
        t3.m2();


        //Child class cannot hold the reference of parent class
//        Test2 t4=new Test1();
//        t4.m1();
//        t4.m2();
    }
}
