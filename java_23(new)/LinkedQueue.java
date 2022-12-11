import java.util.LinkedList;
import java.util.List;

public class LinkedQueue extends AbstractQueue implements Queue{
    private int size;
    private int head;
    private int tail;
    private List<Object> list;

    public LinkedQueue() {
        list = new LinkedList<>();
        size = head = 0;
        tail = -1;
    }

    @Override
    public void enqueue(Object element) {
        assert element != null;
        list.add(element);
        size++;
        tail++;
    }

    @Override
    public Object element() {
        assert size > 0;
        return list.get(head);
    }

    @Override
    public Object dequeue() {
        assert size > 0;
        Object var = list.get(head);
        for(int i = 0; i < tail; i++){
            list.set(i, list.get(i + 1));
        }
        list.remove(tail);
        tail--;
        size--;
        return var;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = head = 0;
        tail = -1;
        list = new LinkedList<Object>();
    }
}
