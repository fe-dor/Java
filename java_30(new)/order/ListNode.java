package order;

import menu.MenuItem;

public class ListNode {
    protected MenuItem value;
    protected ListNode next;

    public ListNode(ListNode node) {
        value = node.value;
        next = node.next;
    }

    public ListNode() {
    }
}
