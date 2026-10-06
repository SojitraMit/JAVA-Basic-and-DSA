import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDupicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        ArrayList<Integer> New=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                New.add(arr[i]);
            }
        }

        for(int i : New){
            System.out.print(i+" ");
        }
        System.out.println();


        // Using Hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for(int i : map.keySet()){
            System.out.print(i+" ");
        }
    }
}
