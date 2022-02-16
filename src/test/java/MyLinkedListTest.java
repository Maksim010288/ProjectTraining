import linked_list.MyLinkedList;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void getElementByIndexFirst(){
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Cow");
        linkedList.add("Tiger");
        linkedList.add("Wolf");
        linkedList.add("Dog");
        assertEquals("Cow", linkedList.getElementByEndOffset(3));
    }

    @Test
    public void getElementByIndexLast(){
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Cow");
        linkedList.add("Tiger");
        linkedList.add("Wolf");
        linkedList.add("Dog");
        assertEquals("Dog", linkedList.getElementByEndOffset(0));
    }

    @Test
    public void getElementByIndexLessList(){
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Cow");
        linkedList.add("Tiger");
        linkedList.add("Wolf");
        linkedList.add("Dog");
        assertNull(linkedList.getElementByEndOffset(-3));
    }

    @Test
    public void getElementByIndexMoreList(){
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Cow");
        linkedList.add("Tiger");
        linkedList.add("Wolf");
        linkedList.add("Dog");
        assertEquals("Cow",linkedList.getElementByEndOffset(5));
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleOneCycle() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("buhatti");
        myLinkedList.add("lincoln");
        myLinkedList.add("masarati");
        myLinkedList.add("bmv");
        myLinkedList.add("audi");
        assertEquals("masarati", myLinkedList.getMiddleOneCycle());

    }

    @org.junit.jupiter.api.Test
    void testGetMiddleZero() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        assertNull(myLinkedList.getMiddle());
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleOneElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("BMV");
        assertEquals("BMV", myLinkedList.getMiddle());
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleTwoElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("BMV");
        myLinkedList.add("Audi");
        assertEquals("BMV", myLinkedList.getMiddle());
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleThreeElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("BMV");
        myLinkedList.add("Audi");
        myLinkedList.add("Volvo");
        assertEquals("Audi", myLinkedList.getMiddle());
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleFourElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("BMV");
        myLinkedList.add("Audi");
        myLinkedList.add("Volvo");
        myLinkedList.add("Opel");
        assertEquals("Audi", myLinkedList.getMiddle());
    }

    @org.junit.jupiter.api.Test
    void testGetMiddleFiveElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("BMV");
        myLinkedList.add("Audi");
        myLinkedList.add("Volvo");
        myLinkedList.add("Opel");
        myLinkedList.add("Toyota");
        assertEquals("Volvo", myLinkedList.getMiddle());
    }
}