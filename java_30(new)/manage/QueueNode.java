package manage;

import order.Order;

public class QueueNode {
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
