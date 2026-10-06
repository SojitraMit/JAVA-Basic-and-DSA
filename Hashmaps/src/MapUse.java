import java.util.HashMap;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("abc",1);
        map.put("def",2);
        map.put("abc1",3);
        map.put("def1",4);

        System.out.println("size "+ map.size());

        if(map.containsKey("abc")){
            System.out.println("has abc");
        }
        if(map.containsValue(2)){
            System.out.println("has 2");
        }

        int s=map.remove("abc");
        System.out.println(s);

        Set<String> keys=map.keySet();
        for(String str : keys){
            System.out.println(str);
        }

    }
}
