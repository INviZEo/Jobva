package org.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromList {
    public void deleteFromList() {
        List<String> list = new ArrayList<>();
        list.add("Angular");
        list.add("Nebakov");
        list.add("Cartoon");

        int indexToRemove = 2;
        if (indexToRemove > 0 && indexToRemove < list.size()) {
            String index = list.remove(indexToRemove);
            System.out.println("Delete: " + index);
        } else {
            System.out.println("index out of range");
        }

        String valueToRemove = "Angular";
        boolean removed = list.remove(valueToRemove);
        if (removed) {
            System.out.println("Removed value: " + valueToRemove);
        } else {
            System.out.println("Value not removed");
        }
    }
}
