package classes_and_objects;

public class DynamicArray {
    private int data[];
    private int nextIdx;

    public DynamicArray(){
        data=new int[5];
        nextIdx=0;
    }

    public int size(){
        return nextIdx;
    }

    public void add(int element){
        if(nextIdx == data.length){
            restructure();
        }
        data[nextIdx]=element;
        nextIdx++;
    }

    private void restructure(){
        int temp[]=data;
        data=new int[data.length*2];
        for(int i=0;i< temp.length;i++){
            data[i]=temp[i];
        }
    }

    public void set(int index ,int element){
        if(index>nextIdx){
            return;
        }
        if(index<nextIdx){
            data[index]=element;
        }
        else{
            add(element);
        }
    }

    public int get(int index){
        if(index>=nextIdx){
            //Error out
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int removeLast(){
        if(size()==0){
            //error out
            return -1;
        }
        int value = data[nextIdx-1];
        data[nextIdx-1]=0;
        nextIdx--;
        return value;
    }
}
