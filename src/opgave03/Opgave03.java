package opgave03;

import opgave03.models.DropOutStack;

public class Opgave03 {
    public static void main(String[] args) {

        DropOutStack<Integer> stack = new DropOutStack<>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after pushing 1, 2, 3: " + stack.size()); // Should print 3

        stack.push(4);
        System.out.println("Stack after pushing 4 (should drop 1): " + stack.size()); // Should print 3

        System.out.println("Top element: " + stack.peek()); // Should print 4

        System.out.println("Popped element: " + stack.pop()); // Should print 4
        System.out.println("Top element after pop: " + stack.peek()); // Should print 3

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size()); // Should print 0
    }
}
