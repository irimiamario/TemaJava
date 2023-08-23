import java.util.Queue;
import java.util.LinkedList;
class PrinterQueue {
    private Queue<Document> queue = new LinkedList<>();
    private int maxSize = 5;

    public synchronized void addDocument(Document document) throws InterruptedException {
        while (queue.size() >= maxSize) {
            wait();
        }
        queue.offer(document);
        System.out.println("Added " + document + " to the queue.");
        notifyAll();
    }

    public synchronized Document getDocument() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        Document document = queue.poll();
        System.out.println("Printing " + document);
        notifyAll();
        return document;
    }
}