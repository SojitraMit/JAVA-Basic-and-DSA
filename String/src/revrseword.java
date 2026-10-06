public class revrseword {


    public static void function(String x){
        char arr[] = x.toCharArray();
        int start=0;
        for(int i=0; i<x.length(); i++){
            if(arr[i] == ' '){
                support(arr,start,i-1);
                arr[i] = ' ';
                start = i+1;
            }
            if(i == x.length()-1){
                support(arr,start,i);
            }
        }

        for(char i : arr){
            System.out.print(i);
        }
    }

    public static void support(char x[],int start, int end){

        char ch;
        while(start <= end){
            ch = x[start];
            x[start] = x[end];
            x[end] = ch;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        String a = "Give proper names to variables and functions";
        function(a);
    }
}

