import java.util.Stack;

public class StackCollection {

    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.peek();
    }
}
