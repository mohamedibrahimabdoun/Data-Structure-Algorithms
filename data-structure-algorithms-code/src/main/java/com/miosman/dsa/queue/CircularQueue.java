package com.miosman.dsa.queue;

public class CircularQueue<T> {
    private int front;
    private int back;
    private int maxSize;
    private T[] array;

    public CircularQueue() {
        this.front = this.back = -1;
        this.maxSize = 10;
        array = (T[]) new Object[this.maxSize];
    }

    public CircularQueue(int size) {
        this.front = this.back = -1;
        this.maxSize = size;
        array = (T[]) new Object[size];
    }


    public  void enqueue(T value) {

    }

    public T dequeue() {
        return null ;
    }

    public void displayQueue(){

    }
}
