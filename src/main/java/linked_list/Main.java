package linked_list;

import linked.MyMap;
import org.example.MapDayAndNumber;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("Honda", 6754);
        map.put("Opel", 54123);
        map.put("Audi", 9087);
        System.out.println(map.get(1));
    }
}
