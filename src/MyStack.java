import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1; // queue1 is used to store the elements
    private Queue<Integer> queue2; // queue2 is used to help pop the top element
    private int top;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) { // Push element x onto stack
        queue1.add(x);
        top = x;
    }
    public int pop() { // Removes the element on top of the stack and returns that element
        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }
        int result = queue1.remove(); // remove the top element
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return result;
    }
    public int top() {
        return top;
    }
    public boolean empty() {
        return queue1.isEmpty(); // Return whether the stack is empty
    }
}
