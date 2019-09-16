/* https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/ */

package practise.datastructures.problems;

import java.util.Stack;

class StackGetMinFunctionality {
    Stack<Integer> s;
    Integer minEle;

    StackGetMinFunctionality() {
        s = new Stack<>();
    }

    void getMin() {
        if (s.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Minimum Element in the stack is : " + minEle);
    }

    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Integer t = s.peek();
        System.out.println("The top mose element is : ");
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    void pop() {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2*minEle - t;
        } else {
            System.out.println(t);
        }
    }

    void push(Integer x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number inserted : " + x);
        }

        if (x < minEle) {
            s.push(2*x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }
        System.out.println("Number Inserted : " + x);
    }

}

public class StackWithGetMin {
    public static void main(String[] args) {
        StackGetMinFunctionality stack = new StackGetMinFunctionality();
        stack.push(3);
        stack.push(5);
        stack.getMin();
        stack.push(2);
        stack.push(1);
        stack.getMin();
        stack.pop();
        stack.peek();
    }
}
