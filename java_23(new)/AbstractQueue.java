public abstract class AbstractQueue {
    private int size;
    private int head;
    private int tail;

    abstract void enqueue(Object element) throws FullQueueException;
    abstract Object element();
    abstract Object dequeue();
    abstract int size();
    abstract boolean isEmpty();
    abstract void clear();
}
