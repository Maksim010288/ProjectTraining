package linked_list;

import linked.MyMap;

public class Main {

    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(67, "gruve");
        myMap.put(876, "gruver");
        myMap.put(876, "oksford");
        myMap.put(67, "gruver");
        myMap.put(376, "gru");
        myMap.put(376, "gruver");
        System.out.println(myMap);
        System.out.println(myMap.get(876));
    }
}
