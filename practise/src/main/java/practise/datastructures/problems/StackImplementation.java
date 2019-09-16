package practise.datastructures.problems;

class StackFunctionality {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    StackFunctionality() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " is pushed into Stack");
            return  true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return a[top];
        }
    }

}

public class StackImplementation {
    public static void main(String[] args) {
        StackFunctionality stack = new StackFunctionality();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop() + "is popped from the Stack");
        stack.push(30);
        System.out.println(stack.peek() + " is the top of the Stack");
    }

}
