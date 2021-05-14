package Dequeue;

import Queue.Queue;

public class DequeueTest  {
    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue();
        dequeue.enQueue(10);
        dequeue.enQueue(20);
        dequeue.enQueue(30);
        dequeue.enQueue(40);
        dequeue.print();
        dequeue.enQueueRear(50);
        dequeue.print();
        dequeue.deQueueFront();
        dequeue.print();

    }
}
