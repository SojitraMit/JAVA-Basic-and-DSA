import java.util.HashMap;

public class Problems {

    public static int MaxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }

        int maxFreq=0;
        int max=arr[0];
        for(int i : arr){
            if(maxFreq < map.get(i)){
                maxFreq=map.get(i);
                max=i;
            }
        }

        return max;
    }

    public static void PairSumTo0(int[] input, int size) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : input) {

            if( map.containsKey(-i) ) {
                for(int j=0;j<map.get(-i);j++) {
                    if(-i < i) {
                        System.out.println( -i +" "+ i  );
                    }
                    else {
                        System.out.println( i +" " + -i  );
                    }
                }
            }

            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
    }

    public static void intersection(int[] arr1, int[] arr2){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr1) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }

        for(int i : arr2) {
            if(map.containsKey(i) && map.get(i) >0) {
                System.out.println(i);
                map.put(i, map.get(i)-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2 ,1 ,-2 ,2 ,3};
//        int ans=MaxFrequencyNumber(arr);
//        System.out.println(ans);

        PairSumTo0(arr, arr.length);
    }
}
