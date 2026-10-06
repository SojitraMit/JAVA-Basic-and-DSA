import java.net.InetAddress;

public class t {

    public static Node<Integer> d(){
        Node<Integer> a=new Node<>(3);
        Node<Integer> c= new Node<>(4);
        a.next=c;
//        a.next.data=4;
//        a.next.next.data=5;
        Node<Integer> b=a;
        b.data=2;
        b.next.data=1;

        return a;
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        String ans= String.valueOf(x);

        for(int i=0;i<ans.length()/2;i++){
            int check=x%10;
            if(ans.charAt(i) != check){
                return false;
            }
            x /= 10;

        }

        return true;
    }

    public static void main(String[] args) {
        Node<Integer> a=d();
        System.out.println(a.data+" "+a.next.data);
        int i = 5;
        int arr[]={1,2,3};
        System.out.println(arr.length);
        System.out.println(isPalindrome(121));
    }
}
