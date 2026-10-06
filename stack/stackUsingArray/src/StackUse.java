public class StackUse {

    public static void main (String args[]) throws stackFullException, stackEmptyException {
        stackUsingArray stack = new stackUsingArray();

        for (int i = 0; i <= 6; i++) {
                stack.push(i);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
