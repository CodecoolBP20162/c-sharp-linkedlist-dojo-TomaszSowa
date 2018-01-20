package com.sowa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Your goal is to make all these tests pass!
// Do not modify this file.
class LinkedListTest {

    @Test
    void initializeLinkedListTest() {
        new LinkedList();
    }

    @Test
    void getLengthTest() {
        LinkedList ll = createList(10);
        assertEquals(10, ll.length());
    }

    @Test
    void addTest() {
        LinkedList linkedList = createList(11);
        linkedList.add(32);
        linkedList.add(42);
        String result = " 0 1 2 3 4 5 6 7 8 9 10 32 42";
        assertEquals(result, linkedList.toString());
    }

//    @Test
//    void iterationTest() {
//        LinkedList linkedList = createList(5);
//        int i = 0;
//        while (linkedList.hasNext()) {
//            assertEquals(i, linkedList.iterate().getData());
//            i++;
//        }
//        LinkedList linkedListZero = new LinkedList();
//        assertEquals(null, linkedListZero.iterate());
//    }

    @Test
    void headTest() {
        LinkedList linkedList = createList(2);
        assertEquals(0, linkedList.getHead().getData());
        LinkedList linkedListZero = new LinkedList();
        assertEquals(null, linkedListZero.getHead());
    }

    @Test
    void tailTest() {
        LinkedList linkedList = createList(7);
        String result = " 1 2 3 4 5 6";
        assertEquals(result, linkedList.getTail().toString());
        LinkedList linkedListZero = new LinkedList();
        assertEquals(null, linkedListZero.getTail());
    }



    @Test
    void removeTest() {
        LinkedList linkedList = createList(11);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.remove(50));
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.remove(-1));
        linkedList.remove(  0);
        linkedList.remove(5);
        linkedList.remove(  8);
        String result = " 1 2 3 4 6 7 8 9";
        assertEquals(result, linkedList.toString());
    }


    @Test
    void insertTest()
    {
        LinkedList linkedList = createList(11);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.insert(50, 20));
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.insert(-1, 20));
        linkedList.insert(10, 100);
//        linkedList.insert(8, 80);
        linkedList.insert(0, -30);

        String result = " -30 0 1 2 3 4 5 6 7 80 8 9 10 100";
        assertEquals(result, linkedList.toString());
    }


    private LinkedList createList(int numOfElements) {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < numOfElements; ++i) {
            linkedList.add(i);
        }
        return linkedList;
    }
}