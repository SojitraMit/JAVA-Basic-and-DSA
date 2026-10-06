public class ABcheck {
    public static boolean checkString(String str){
        if(str.length()==0){
            return true;
        }
        if(str.charAt(0)=='a'){
            if(str.length()==1){
                return true;
            }
            else if(str.length()>=2 && str.substring(1,2).equals('a')){
                return checkString(str.substring(2));
            }
            else if(str.length()>=3 && str.substring(1,3).equals("bb")){
                return checkString(str.substring(3));
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        // Sample Input 1
        String S1 = "abb";
        System.out.println(checkString(S1)); // Output: true

        // Sample Input 2
        String S2 = "abababa";
        System.out.println(checkString(S2)); // Output: false
    }
}
