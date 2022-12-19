package mirea.java.java_30.order;

import mirea.java.java_30.menu.MenuItem;

import java.io.Serializable;

public class ListNode implements Serializable {
    protected MenuItem value;
    protected ListNode next;

    public ListNode(ListNode node) {
        value = node.value;
        next = node.next;
    }

    public ListNode() {
    }
}
