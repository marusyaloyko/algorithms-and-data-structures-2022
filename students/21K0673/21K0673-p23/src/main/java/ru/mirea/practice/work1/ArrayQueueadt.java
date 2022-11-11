package ru.mirea.practice.work1;

abstract class ArrayQueueadt {
    int size;
    int[] items;
    int front;
    int rear;

    abstract int getElement(int index);

    abstract boolean isFull();

    abstract boolean isEmpty();

    abstract void enqueue(int element);

    abstract int dequeue();

    abstract void element();

    abstract void size();

    abstract void clear();

    abstract void display();
}
