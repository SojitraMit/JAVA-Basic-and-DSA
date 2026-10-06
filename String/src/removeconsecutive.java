public class removeconsecutive {

    public static String function(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return function(input.substring(1));
        else
            return input.charAt(0) + function(input.substring(1));
    }

    public static void main(String args[]){
        String a = "aaaabbbbccccdddddddddddjjjjjjjj";
        System.out.println(function(a));
    }
}
