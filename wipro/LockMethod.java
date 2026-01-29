import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    private int count=0;
    private Lock lock=new ReentrantLock();
    public void increment(){
        lock.lock();
    }
}

public class LockMethod {
    public static void main(String[] args) {
        
    }
}
