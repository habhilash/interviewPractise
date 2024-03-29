package practise.datastructures.problems;

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (root == null)
            root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " is pushed to stack");
    }

    public int pop() {
        int popped = Integer.MAX_VALUE;
        if (root == null)
            System.out.println("Stack is Empty");
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else
            return root.data;
    }

    public static void main(String[] args) {
        StackAsLinkedList s = new StackAsLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " is popped from the stack");
        System.out.println(s.peek() + " is top of the stack");
    }
}
