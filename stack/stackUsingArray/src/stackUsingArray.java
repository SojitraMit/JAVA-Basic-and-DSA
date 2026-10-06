import java.util.ArrayList;

public class stackUsingArray {

    private int data[];
    private int top;

    public stackUsingArray(){
        data=new int[5];
        top=-1;
    }

    public stackUsingArray(int capacity){
        data=new int[capacity];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws stackEmptyException{
        if(size()==0){
            stackEmptyException e=new stackEmptyException();
            throw e;
        }
        return data[top];
    }

    private void doubleCapacity(){
        int temp[]=data;
        data = new int[2 * temp.length];

        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
        

    }

    public void push (int ele) throws stackFullException {
        if(size()== data.length){
//            stackFullException e=new stackFullException();
//            throw e;
            doubleCapacity();
        }
        top++;
        data[top]=ele;
    }

    public int pop() throws stackEmptyException{
        if(size()==0){
            stackEmptyException e=new stackEmptyException();
            throw e;
        }
        int temp=data[top];
        top--;
        return temp;
    }
}
