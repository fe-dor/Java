package mylist;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList<T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public MyList() {
    }

    public T getHead(){
        return head.data;
    }

    public void add(T element){
        if(head == null) {
            head = tail = new Node<>();
            head.prev = head;
            head.next = head;
            head.data = element;
        }
        else {
            tail.next = new Node<>();
            tail.next.data = element;
            tail.next.prev = tail;
            tail.next.next = head;
            tail = tail.next;
        }
        size++;
    }

    public T pop(){
        Node<T> n = head;
        head = head.next;
        tail = n;
        return n.data;
    }

    public int size() {
        return size;
    }

    public void delete(T elem){
        Node<T> node = head;
        for(int i = 0 ; i < size; i++){
            if(node.data.equals(elem)){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                return;
            }
            node = node.next;
        }
        System.out.println("No such element");
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

}
