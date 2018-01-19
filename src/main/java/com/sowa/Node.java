package com.sowa;

public class Node<T> {

    Node previous = null;
    Node next = null;
    T data;

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
