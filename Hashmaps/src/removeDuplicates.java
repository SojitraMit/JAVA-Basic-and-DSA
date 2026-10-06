import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

    public static ArrayList<Integer> RemoveDuplicates(int[] arr){
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> seen=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(seen.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i],true);
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1,4,5555,3,1,8};
        ArrayList<Integer> output=RemoveDuplicates(arr);
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }
}
