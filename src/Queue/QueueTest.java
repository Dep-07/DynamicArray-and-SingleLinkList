package Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.print();
        System.out.println(queue.empty());
        queue.dQueue();
        queue.print();
        System.out.println(queue.size());
        System.out.println(queue.contain(10));
        System.out.println(queue.peek());
    }
}
