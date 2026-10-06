import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue(){
        heap=new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size()==0;
    }

    int size(){
        return heap.size();
    }

    int getMax() throws PriorityQueueEmptyException {
        if(isEmpty()){
            throw new PriorityQueueEmptyException();
        }

        return heap.get(0);
    }

    void insert(int element){
        heap.add(element);

        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;

        while (childIndex>0){
            if(heap.get(childIndex) > heap.get(parentIndex)){
                int temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);

                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else {
                return;
            }
        }
    }

    public void downHeapify() {
        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex + 1;
        int rightChildIndex = 2*parentIndex + 2;
        int maxIndex = 0;

        while(leftChildIndex<heap.size()) {
            if(heap.get(leftChildIndex) > heap.get(maxIndex) ) {
                maxIndex = leftChildIndex;
            }
            if( rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex) ) {
                maxIndex = rightChildIndex;
            }
            if(maxIndex!=parentIndex) {
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(maxIndex));
                heap.set(maxIndex,  temp );
                parentIndex = maxIndex;
                leftChildIndex = 2*parentIndex + 1;
                rightChildIndex = 2*parentIndex + 2;
            }else {
                break;
            }
        }
    }
    public int removeMax() throws PriorityQueueEmptyException {
        if(isEmpty()) {
            throw new PriorityQueueEmptyException();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        downHeapify();
        return temp;
    }
}
