package practise.datastructures.problems;

/*
* Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each operand may be an integer or another
expression.
Some examples:
["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

After understanding the problem, we should quickly realize
that this problem can be solved by using a stack. We can loop through each element
in the given array. When it is a number, push it to the stack. When it is an operator,
pop two numbers from the stack, do the calculation, and push back the result.

* */

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String t : tokens) {
            if (!operators.contains(t))
                stack.push(t);
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                int index = operators.indexOf(t);

                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a-b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }

}
