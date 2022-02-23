package linkedlist;

import collections.MyCollection;


public class MyLinkedList<E> implements MyCollection<E> {
    public MyNode<E> first;
    MyNode<E> last;
    public int size = 0;

    public E add(E e) {
        MyNode<E> newNode = new MyNode<>();
        newNode.value = e;

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
        return newNode.value;
    }

    @Override
    public E get(int index) {
        MyNode<E> myNode = first;
        int count = 0;
        while (count <= index) {
            if (count == index) {
                return myNode.value;
            }
            myNode = myNode.next;
            count++;
        }
        return null;
    }

    public E getMiddle() {
        MyNode<E> myNodeFirst = first;
        MyNode<E> myNodeLast = last;
        while (myNodeFirst != null) {
            if (myNodeFirst.equals(myNodeLast) ||
                    myNodeFirst.equals(myNodeLast.next) ||
                    myNodeFirst.equals(myNodeLast.previous)) {
                return myNodeFirst.value;
            }
            myNodeFirst = myNodeFirst.next;
            myNodeLast = myNodeLast.previous;
        }
        return null;
    }


    public E getMiddleOneCycle() {
        MyNode<E> middle = first;
        MyNode<E> counter = first;
        while (counter != null) {
            counter = counter.next;
            if (counter != null) {
                middle = middle.next;
                counter = counter.next;
            }
        }
        if (middle != null) {
            return middle.value;
        } else {
            return null;
        }
    }


    public E getElementByEndOffset(int endListElement) {
        MyNode<E> counter = first;
        MyNode<E> elementOutput = first;
        int count = 0;
        while (counter != null) {
            if (count > endListElement) {
                elementOutput = elementOutput.next;
            } else if (count < 0) {
                return null;
            }
            count++;
            counter = counter.next;
        }
        if (elementOutput != null) {
            return elementOutput.value;
        } else {
            return null;
        }
    }


    public static class MyNode<E> {
        public E value;
        public MyNode<E> next;
        MyNode<E> previous;
    }
}


