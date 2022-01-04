package com.miosman.dsa.queue;

public class MyQueue<T> {
    private int front;
    private int back;
    private int maxSize;
    private int currentSize;
    private T[] array;


    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    public boolean isFull() {
        return this.currentSize == this.maxSize;
    }

    public T top() {
        return array[front];
    }


    public void maxSize(T value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize; //to keep the index in range
        array[back] = value;
        currentSize++;
    }

    public void enqueue(T value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize; //to keep the index in range
        array[back] = value;
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }

        T temp = array[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }

}
