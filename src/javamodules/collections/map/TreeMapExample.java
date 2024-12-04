package javamodules.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Üç");
        map.put(1, "Bir");
        map.put(2, "İki");

        System.out.println(map); // Çıktı: {1=Bir, 2=İki, 3=Üç} (Sıralı)
    }
}
