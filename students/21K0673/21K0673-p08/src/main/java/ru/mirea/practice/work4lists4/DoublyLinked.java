package ru.mirea.practice.work4lists4;

public class DoublyLinked<String> {
    private ListNode<String> front;
    private int size;

    public DoublyLinked() {
        front = null;
    }

    public void addFront(String x) {
        if (isEmpty()) {
            front = new ListNode<>(x);
        } else {
            ListNode<String> temp = front;
            front = new ListNode<>(null, x, temp);
            if (size > 0) {
                if (front.data.toString().charAt(0) < front.next.data.toString().charAt(0) | (front.data.toString().charAt(0) == front.next.data.toString().charAt(0) & front.data.toString().length() == front.next.data.toString().length())) {
                    front.next.prev = front;
                } else {
                    addAfter(front.next.data, front.data);
                    remove(front.data);
                    size--;
                    for (int i = 1; i < size; i++) {
                        front = new ListNode<>(front, front.next.data, front.next.next);
                        System.out.println(front.prev.data + " " + front.data + " " + front.next.data);
                        addAfter(front.next.data, front.data);
                        remove(front.data);
                        addFront(front.prev.data);
                        size--;
                    }
                }
            } else {
                front.next.prev = front;
            }
        }
        size++;
    }

    public void addAfter(String x, String y) {
        if (isEmpty()) {
            System.out.println("Элемент " + x.toString() + " не найден");
        } else {
            ListNode<String> current = front;
            while (current != null && !current.data.equals(x))
                current = current.next;
            if (current == null) {
                System.out.println("Элемент " + x.toString() + " найден");
            } else {
                ListNode<String> newNode = new ListNode<>(current, y, current.next);
                if (current.next != null)
                    current.next.prev = newNode;
                current.next = newNode;
            }
        }
        size++;
    }

    public void remove(String x) {
        if (isEmpty()) {
            System.out.println("Элемент " + x.toString() + " не найден");
        } else {
            if (front.data.equals(x)) {
                front = front.next;
                return;
            }
            ListNode<String> current = front;
            while (current != null && !current.data.equals(x)) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Элемент " + x.toString() + " не найден");
            } else {
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                current.prev.next = current.next;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public java.lang.String toString() {
        ListNode<String> temp = front;
        StringBuilder builder = new StringBuilder("[");
        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
