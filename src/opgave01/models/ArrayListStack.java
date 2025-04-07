package opgave01.models;

import java.util.ArrayList;

public class ArrayListStack<E> implements StackEaaa{

    private ArrayList<E> elements;

    public ArrayListStack() {
        elements = new ArrayList<>();
    }

    @Override
    public void push(Object element) {
        elements.add((E) element);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.removeLast();
    }

    @Override
    public Object peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.getLast();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();

    }

    @Override
    public int size() {
        return elements.size();
    }
}