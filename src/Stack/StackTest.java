package Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);

        stack.print();
        //stack.pop();
        stack.print();
        System.out.println(stack.contains(3));

    }
}
