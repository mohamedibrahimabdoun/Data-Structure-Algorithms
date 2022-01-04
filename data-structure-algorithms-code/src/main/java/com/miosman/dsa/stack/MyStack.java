package com.miosman.dsa.stack;

public class MyStack<T> {
    private int maxSize;
    private int top;
    private T array[];

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1; //initialized with -1 whe stack is empty
        array = (T[]) new Object[maxSize];

    }

    //returns the maximum size capacity
    public int getMaxSize() {
        return this.maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    //Retruns the value at the top
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return array[top];

    }

    public void push(T value) {
        if (isFull()) {
            System.err.println("Stack is Full!");
            return;

        }
        array[++top] = value; //increments the top and adds value to updated top

    }

    public T pop() {
        if (isEmpty()) {
            System.err.println("Stack is Empty!");
            return null;
        }
        return array[this.top--]; //returns value and top and decrements the top
    }
}
