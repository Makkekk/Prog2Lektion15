package opgave01;

import opgave01.models.ArrayListStack;

public class Opgave01 {
    public static void main(String[] args) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size after pushing 1, 2, 3: " + stack.size()); // Should print 3

        System.out.println("Top element: " + stack.peek()); // Should print 3

        System.out.println("Popped element: " + stack.pop()); // Should print 3
        System.out.println("Top element after pop: " + stack.peek()); // Should print 2

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size()); // Should print 0
    }
}