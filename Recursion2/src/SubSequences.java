public class SubSequences {
    public static String[] Subsequences(String str){
        if(str.length()==0){
            String ans[] ={""};
            return ans;
        }

        String smallAns[]=Subsequences(str.substring(1));
        String ans[]=new String[smallAns.length*2];
        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k]=smallAns[i];
            k++;
        }
        for(int j=0;j<smallAns.length;j++){
            ans[k]=str.charAt(0) + smallAns[j];
            k++;
        }
        return ans;
    }
    public static void main(String[] args){
        String str="abc";
        String ans[] = Subsequences(str);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
