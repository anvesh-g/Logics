package src.com.set_1.go.codefaqs.MultiThreading.type3;

import java.util.concurrent.Callable;

public class ByExecutor implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=0;i<10;i++){
            sum=sum+i;
        }
        return sum;
    }
}
