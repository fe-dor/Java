public class Test {
    public static void main(String[] args) throws FullQueueException {
        ArrayQueueModule aqm = new ArrayQueueModule(5);
        aqm.enqueue(3);
        aqm.enqueue(5);
        aqm.enqueue(7);
        aqm.enqueue(8);
        System.out.println("size " + aqm.size());
        System.out.println(aqm.dequeue());
        System.out.println(aqm.dequeue());
        System.out.println(aqm.dequeue());
        System.out.println(aqm.dequeue());
        aqm.enqueue(4);
        aqm.enqueue(20);
        System.out.println(aqm.dequeue());
        System.out.println(aqm.dequeue());
        System.out.println("size " + aqm.size());
        System.out.println();

        LinkedQueue lq = new LinkedQueue();
        ArrayQueueADT aqm1 = new ArrayQueueADT(lq);
        aqm1.enqueue(3);
        aqm1.enqueue(5);
        aqm1.enqueue(7);
        aqm1.enqueue(8);
        System.out.println("size " + aqm1.size());
        System.out.println(aqm1.dequeue());
        System.out.println(aqm1.dequeue());
        System.out.println(aqm1.dequeue());
        System.out.println(aqm1.dequeue());
        aqm1.enqueue(82);
        aqm1.enqueue(14);
        System.out.println(aqm1.dequeue());
        System.out.println(aqm1.dequeue());
        System.out.println("size " + aqm1.size());
        System.out.println();
    }
}
