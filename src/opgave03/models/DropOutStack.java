package opgave03.models;

import opgave01.models.StackEaaa;

import java.util.NoSuchElementException;

public class DropOutStack<E> implements StackEaaa<E> {

    private Node<E> head;
    private Node<E> tail;
    private int maxSize;
    private int size;

    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element, null, head);
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        if(tail == null) {
            tail = head;
        }
        if (size == maxSize) {
            tail = tail.previous;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            size++;
        }

    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        E element = head.element;
        head = head.next;
        if(head != null) {
            head.previous = null;
        } else {
            tail = null;
        }
        size--;
        return element;
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        Node(T element, Node<T> next, Node<T> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}