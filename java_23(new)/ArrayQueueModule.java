public class ArrayQueueModule extends AbstractQueue implements Queue{
    private int head;
    private int tail;
    private int size;
    private Object[] array;
    private final int maxSize;

    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        array = new Object[maxSize];
        tail = -1;
        head = 0;
        size = 0;
    }

    //pre: elem != null
    //post: queue[tail] = elem,
    //post: tail = tail + 1
    public void enqueue(Object elem) throws FullQueueException {
        assert elem != null;
        if(tail + 1 == maxSize){
            throw new FullQueueException();
        }
        tail++;
        array[tail] = elem;
        size++;
    }

    //pre: tail > -1
    //post: R = elements[head]
    public Object element(){
        assert size > 0;
        return array[head];
    }

    //pre: tail > -1
    //post: R = array[head],
    //      tail = tail - 1;
    //      size = size - 1;
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

    //pre: R = size
    public int size() {
        return size;
    }

    //post: R = (size == 0)
    public boolean isEmpty() {
        return size == 0;
    }

    //post: tail = -1,
    //      head = 0
    public void clear() {
        tail = -1;
        head = 0;
    }
}
