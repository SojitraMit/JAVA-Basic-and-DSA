public class PrefixPrint {
    public static void print(String a){
        for(int i=0;i<a.length();i++){
            System.out.println(a.substring(0,i+1));
        }
    }
    public static void main(String[] args){
        String str="abcde";
        print(str);
    }
}
