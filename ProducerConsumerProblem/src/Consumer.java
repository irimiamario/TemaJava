class Consumer implements Runnable {
    private PrinterQueue printerQueue;

    public Consumer(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 90; i++) {
            try {
                Document document = printerQueue.getDocument();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}