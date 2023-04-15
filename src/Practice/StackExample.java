package Practice;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args){

        Stack<String> myStack = new Stack<>();

        myStack.push("Bhavani");
        myStack.push("Subhash");
        myStack.push("Rathod");

        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);

        myStack.peek();
        System.out.println(myStack);

    }

}
