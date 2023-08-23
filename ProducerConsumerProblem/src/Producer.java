import java.util.Random;
class Producer implements Runnable {
    private PrinterQueue printerQueue;

    public Producer(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            Document document = new Document();
            try {
                printerQueue.addDocument(document);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
