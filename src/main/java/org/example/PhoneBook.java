package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public void searchNumberForName() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Nikita", "+789214121");
        map.put("Denis", "+1914859484");
        map.put("Vova", "+1488228322");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("Стоп")) {
                break;
            }
            System.out.println(map.getOrDefault(name, "Абонента не существует"));
        }
    }
}
