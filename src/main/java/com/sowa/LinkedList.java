package com.sowa;

public class LinkedList<T> {

    private int length = 0;
    private Node head = null;
    private Node last = null;
    private int index = 0;
    private Node iterated;


    LinkedList() {}

    public Node head() {
        return head;
    }

    public Node[] tail() {
        Node[] tail = new Node[length];
        Node item = head.getNext();
        int index = 0;
        while (item.getNext() != null) {
            tail[index] = item;
            item = item.getNext();
            index++;
        }
        return tail;
    }

    public int length() {
        return length;
    }


    public void add(T newItem) {
        if (length == 0) {
            head = new Node();
            head.setData(newItem);
            last = head;
            iterated = head;
        } else {
            Node newLast = new Node();
            newLast.setData(newItem);
            last.setNext(newLast);
            last = newLast;
        }
        length++;
    }

    public boolean hasNext() {

        if(index < length) {
            return true;
        }
        return false;
    }

    public Node iterate() {

        Node result = iterated;
        if (this.hasNext()) {
            index++;
            iterated = iterated.getNext();
            return result;
        }
        return null;
    }

    public void remove(int index) {

    }

    public void insert(int index, int newItem) {
    }

    @Override
    public String toString() {

        String result = "";
        Node node = head;
        for (int i = 0; i < length; i++) {
            result += " " + node.getData();
            node = node.getNext();
        }
        return result;
    }
}
