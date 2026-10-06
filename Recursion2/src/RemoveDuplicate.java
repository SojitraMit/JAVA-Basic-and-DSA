public class RemoveDuplicate {
    public static String remove(String str){
        if(str.length()==1){
            return str;
        }

        String smallAns=remove(str.substring(1));

        if(str.charAt(0)==smallAns.charAt(0)){
            return smallAns;
        }
        return str.charAt(0)+smallAns;
    }
    public static void main(String[] args){
        String str="aabfgeccccvbbbgggre";
        String ans=remove(str);
        System.out.print(ans);
    }
}
