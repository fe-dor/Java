public class ArrayQueueADT {
    private Queue queue;

    //queue != null
    public ArrayQueueADT(Queue queue) {
        assert queue != null;
        this.queue = queue;
    }

    //pre: elem != null
    //post: queue[tail] = elem
    public void enqueue(Object elem) throws FullQueueException {
        queue.enqueue(elem);
    }

    //pre: tail > -1
    //post: R = queue[head]
    public Object element(){
        return queue.element();
    }

    //pre: tail > -1
    //post: R = queue[head],
    //post: head = head + 1
    public Object dequeue() {
        return queue.dequeue();
    }

    //post: R = rear
    public int size() {
        return queue.size();
    }

    //post: R = (size == 0)
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //post: tail = -1,
    //      head = 0
    public void clear() {
        queue.clear();
    }
}
