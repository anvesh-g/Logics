package src.com.set_1.go.codefaqs.MultiThreading.type1;

public class ByClass  extends Thread{


    public void run(){
        for(int i=0;i<10;i++){
            System.out.print("Thread "+i);
            System.out.println(" "+Thread.currentThread().getId());
        }
    }

}
