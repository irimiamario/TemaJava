public class MainTestPrinter {
    public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();
        Thread consumerThread = new Thread(new Consumer(printerQueue));

        Thread[] producerThreads = new Thread[3];
        for (int i = 0; i < producerThreads.length; i++) {
            producerThreads[i] = new Thread(new Producer(printerQueue));
        }

        consumerThread.start();
        for (Thread producerThread : producerThreads) {
            producerThread.start();
        }

        try {
            consumerThread.join();
            for (Thread producerThread : producerThreads) {
                producerThread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}