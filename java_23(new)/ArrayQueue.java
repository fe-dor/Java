public class ArrayQueue extends AbstractQueue implements Queue{
    private final int CAPACITY = 10;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(){
        array = new Object[CAPACITY];
        size = head = 0;
        tail = -1;
    }

    // pre: value != null
    // pre: value is immutable
    // post: queue[size - 1] = element
    // post: size' = size + 1
    public void enqueue(Object element) throws FullQueueException {
        assert element != null;
        if(tail + 1 == CAPACITY){
            throw new FullQueueException();
        }
        tail++;
        array[tail] = element;
        size++;
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    public Object element() {
        assert size > 0;
        return array[head];
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    // Post: size' = size - 1
    public Object dequeue() {
        assert size > 0;
        Object var = array[head];
        for(int i = 0; i < tail; i++) {
            array[i] = array[i + 1];
        }
        array[tail] = var;
        tail--;
        size--;
        return var;
    }

    // Post: Result = size
    public int size() {
        return size;
    }

    // Post: Result = size > 0?
    public boolean isEmpty() {
        return size == 0;
    }

    // INV: size' = 0;
    // Post: Clear the queue
    public void clear() {
        size = head = 0;
        tail = -1;
        array = new Object[CAPACITY];
    }
}
