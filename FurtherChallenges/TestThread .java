package FurtherChallenges;
import java.util.concurrent.atomic.AtomicInteger;

class TestThread {

    static class Counter {
        // instance of the atomic integer class
        private AtomicInteger c = new AtomicInteger(0);

        public void increment() {
            // atomically increment the current value by one
            c.getAndIncrement();
        }

        public int value() {
            // get The current value

            return c.get();
        }
    }

    public static void main(final String[] arguments) throws InterruptedException {
        // instance of the class counter
        final Counter counter = new Counter();

        //200 threads
        for(int i = 0; i < 200 ; i++) {

            // implementation and creation of a new thread
            new Thread(new Runnable() {
                public void run() {
                    counter.increment();
                }
            }).start();
        }
        Thread.sleep(6000);
        // printing final result
        // Invoking the method value provides the current value
        System.out.println("Final number (should be 200): " + counter.value());
    }
}