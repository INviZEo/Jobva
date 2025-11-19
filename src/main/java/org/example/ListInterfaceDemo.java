package org.example;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public void link() {
        List<String> list = new LinkedList<>();
        list.add(0, "Misha");
        list.add(1, "Kirill");
        list.add(2, "Gregory");
        list.set(1, "Agafia");
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index: " + i + " = " + list.get(i));
        }
    }
}
