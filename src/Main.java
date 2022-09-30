import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();

    }
}

/**
 * The code above is not deterministic
 * it doesn't always produce the same result every time
 *
 * it needs a lock for account access
 */

// use synchronized keyword on a method or an object to lock an object
// so only one thread can use it at a time

// point of synchronization is to make a specific section of code work
// ATOMICALLY

/**
 * Object's lock
 */

// Every Java object has a lock.
// A lock has only one key.
// If an object has synchronized methods, a thread can enter one of the
// synchronized methods ONLY if the key for the object's lock is available.

/**
 * Race conditions
 */

/**
 * Lost updates
 * when during execute operation one (for example i = i + 1)
 * one thread read the data, and then goes to runnable,
 * after it runs again and set wrong update to a variable
 *
 */

/**
 * Deadlock
 * situation when you have two threads, both of which are holding a key the other thread wants
 */

// atomic variables (int, long, boolean)
// these classes provide methods that are atomic
// and can safely be used by a thread without worrying about another thread
// changing the object's values at the same time

/**
 * AtomicInteger
 * AtomicLong
 * AtomicBoolean
 * AtomicReference
 */

// CAS - compare and swap operations

// compareAndSet();
// takes a value, which is what you expect the atomic variable to be,
// compares it to the current value, and if it that matches,
// then the operation will complete

// optimistic locking

/**
 * Making an object immutable
 *
 * when an object's data cannot be changed, we call it an immutable object
 */

// use immutable data classes where you can
// limit the numbers of places where data can be changed by multiple threads

// if an object is changed by one thread while thread is reading that collection,
// you can get a ConcurrentModificationException





