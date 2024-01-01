package ru.greatstep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String key = UUID.randomUUID().toString();
            System.out.println(key);
            map.put(key, i);
        }
        System.out.println();
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<String, String> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            String key = UUID.randomUUID().toString();
            System.out.println(key);
            linkedMap.put(key, String.valueOf(i));
        }
        System.out.println();
        for (String key : linkedMap.keySet()) {
            System.out.println(key);
        }

        Map<Cat, String> mapCats = new HashMap<>();
        Cat cat1 = new Cat("Лея");
        Cat cat2 = new Cat("Зоя");

        System.out.println(cat1.hashCode());
        System.out.println(cat1.hashCode());

        mapCats.put(cat1, "Алиса");

        mapCats.put(cat2, "Дима");
        System.out.println(mapCats);

        System.out.println(mapCats.get(cat1));
    }

}

record Cat(String name) {

}
