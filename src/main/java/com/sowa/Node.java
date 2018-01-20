package com.sowa;

public class Node<T> {

    private Node previous = null;
    private Node next = null;
    private T data;

    Node() {}

    Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
