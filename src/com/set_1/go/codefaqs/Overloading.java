package src.com.set_1.go.codefaqs;

public class Overloading {

    public static void main(String[] args) {

        Overloading overloading=new Overloading();
        overloading.sayHello(new String("Olango"));
        overloading.sayHello(new Object());
        overloading.sayHello(null);

    }


    public void sayHello(String name){
        System.out.println("Hello String "+name);
    }

    public void sayHello(Object object){
        System.out.println("Hello Object "+object.toString());
    }



}
