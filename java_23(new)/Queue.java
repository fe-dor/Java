public interface Queue {
    public void enqueue(Object element) throws FullQueueException;
    public Object element();
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();
}
