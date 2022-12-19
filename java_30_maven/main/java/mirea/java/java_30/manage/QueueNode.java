package mirea.java.java_30.manage;

import mirea.java.java_30.order.Order;

import java.io.Serializable;

public class QueueNode implements Serializable {
    protected Order value; //контент
    QueueNode prev; //ссылка на предыдущий элемент
    QueueNode next; //ссылка на следующий элемент

    public QueueNode(Order value, QueueNode prev, QueueNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public QueueNode() {
    }
}
