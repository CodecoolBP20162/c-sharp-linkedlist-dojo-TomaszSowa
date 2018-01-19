package com.sowa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Your goal is to make all these tests pass!
// Do not modify this file.
class LinkedListTest {

    @Test
    void DynamicIntArrayTest_WithInitialSize() {
        new LinkedList(15);
    }

    @Test
    void addTest() {
        LinkedList array = createArray(11);
        array.add(32);
        array.add(42);
        String result = " 0 1 2 3 4 5 6 7 8 9 10 32 42";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest() {
        LinkedList array = createArray(11);
        array.remove(5);
        array.remove(0);
        String result = " 1 2 3 4 6 7 8 9 10";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_LastItem()
    {
        LinkedList array = createArray(10);
        array.remove(9);
        String result = " 0 1 2 3 4 5 6 7 8";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_InvalidItem()
    {
        LinkedList array = createArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }

    @Test
    void insertTest()
    {
        LinkedList array = createArray(11);
        array.insert(8, 223);
        array.insert(100, 654);

        String result = " 0 1 2 3 4 5 6 7 223 8 9 10 654";
        assertEquals(result, array.toString());
    }

    private LinkedList createArray(int numOfElements) {
        LinkedList array = new LinkedList();
        for (int i = 0; i < numOfElements; ++i)
        {
            array.add(i);
        }
        return array;
    }
}