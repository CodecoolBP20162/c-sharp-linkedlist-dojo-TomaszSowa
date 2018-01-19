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

    @Test
    void iterationTest() {
        LinkedList linkedList = createList(5);
        while (linkedList.hasNext()) {

            System.out.println(linkedList.iterate().getData());
        }
    }
/*
    @Test
    void removeTest() {
        LinkedList linkedList = createList(11);
        linkedList.remove(5);
        linkedList.remove(0);
        String result = " 1 2 3 4 6 7 8 9 10";
        assertEquals(result, linkedList.toString());
    }

    @Test
    void removeTest_LastItem()
    {
        LinkedList linkedList = createList(10);
        linkedList.remove(9);
        String result = " 0 1 2 3 4 5 6 7 8";
        assertEquals(result, linkedList.toString());
    }

    @Test
    void removeTest_InvalidItem()
    {
        LinkedList linkedList = createList(10);
//        assertThrows(linkedListIndexOutOfBoundsException.class, () -> linkedList.remove(10));
//        assertThrows(linkedListIndexOutOfBoundsException.class, () -> linkedList.remove(-1));
    }

    @Test
    void insertTest()
    {
        LinkedList linkedList = createList(11);
        linkedList.insert(8, 223);
        linkedList.insert(100, 654);

        String result = " 0 1 2 3 4 5 6 7 223 8 9 10 654";
        assertEquals(result, linkedList.toString());
    }
*/

    private LinkedList createList(int numOfElements) {
        LinkedList linkedList = new LinkedList();
//        Float magicNumber = 3.14f;
        int magicNumber = 1;
        for (int i = 0; i < numOfElements; ++i) {
            linkedList.add(i * magicNumber);
        }
        return linkedList;
    }
}