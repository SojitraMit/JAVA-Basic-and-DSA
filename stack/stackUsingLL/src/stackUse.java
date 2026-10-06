public class stackUse {
    public static void main(String args[]) throws stackEmptyException {
        stackUsingLL<Integer> stack=new stackUsingLL<>();

        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());


    }
}
