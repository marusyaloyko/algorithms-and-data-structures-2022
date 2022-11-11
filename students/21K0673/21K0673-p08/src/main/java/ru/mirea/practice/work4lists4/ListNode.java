package ru.mirea.practice.work4lists4;

class ListNode<String> {
    String data;
    ListNode<String> next;
    ListNode<String> prev;

    ListNode(String data) {
        this(null, data, null);
    }

    ListNode(ListNode<String> prev, String data, ListNode<String> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
