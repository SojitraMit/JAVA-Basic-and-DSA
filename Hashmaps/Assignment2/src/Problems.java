import java.util.HashMap;
import java.util.Scanner;

public class Problems {

    public static String RemoveDuplicates(String str){
        HashMap<Character,Boolean> map=new HashMap<>();
        String ans="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                continue;
            }
            map.put(ch,true);
            ans += ch;
        }

        return ans;
    }

    public static void findPairsDifferenceK(int[] input, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++) {

            if(map.containsKey(input[i] - k) && k!=0 ) {

                for(int count = 0 ; count < map.get(input[i] - k);count++ ) {
                    if(input[i] - k < input[i]) {
                        System.out.println(input[i] - k +" " + input[i]);
                    }
                    else {
                        System.out.println(input[i] +" " + (input[i] - k));
                    }
                }

            }
            if(map.containsKey(input[i] + k)) {

                for(int count = 0 ; count < map.get(input[i] + k);count++ ) {
                    if(input[i] + k < input[i]) {
                        System.out.println(input[i] + k +" " + input[i]);
                    }
                    else {
                        System.out.println(input[i] +" " + (input[i] + k));
                    }
                }

            }
            if(map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i]) + 1 );
            }
            else {
                map.put(input[i],1);
            }

        }

    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str= String.valueOf(s.next());
        String ans=RemoveDuplicates(str);
        System.out.println(ans);
    }

}
