package yanrui.Test;

import java.util.HashMap;

public class hashMapTest {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(null,null);
        map.put(0,null);
        map.put(null,0);
        System.out.println(map);
    }
}
