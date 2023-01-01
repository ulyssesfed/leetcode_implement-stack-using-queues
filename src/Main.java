public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(); // Initialize data structure
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top()); // returns 2
        System.out.println(stack.pop()); // returns 2
        System.out.println(stack.empty()); // returns false
    }
}