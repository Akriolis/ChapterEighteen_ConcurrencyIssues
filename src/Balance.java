import java.util.concurrent.atomic.AtomicInteger;

public class Balance {
    AtomicInteger balance = new AtomicInteger(0);

    public void increment(){
        balance.incrementAndGet();
    }
}
