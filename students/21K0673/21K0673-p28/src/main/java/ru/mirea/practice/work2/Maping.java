package ru.mirea.practice.work2;

import java.util.HashMap;
import java.util.Map;

public class Maping<K, V> {
    public Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Соколов", "Егор");
        map.put("Петров", "Михаил");
        map.put("Сеницин", "Георгий");
        map.put("Воробьёв", "Егор");
        map.put("Зайцев", "Андрей");
        map.put("Ерёменко", "Александр");
        map.put("Мудко", "Азамат");
        map.put("Путин", "Семён");
        map.put("Горбунько", "Сергей");
        map.put("Николаенко", "Михаил");
        return map;
    }

    public int getSameFirstNameCount() {
        int amount = 0;
        System.out.println(amount);
        return amount;
    }
}
