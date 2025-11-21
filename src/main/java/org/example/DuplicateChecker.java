package org.example;

import java.util.*;

public class DuplicateChecker<T> {
    public void check () {
        Scanner scanner = new Scanner(System.in);
        Set<String> hashSet = new HashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println(hashSet);
                break;
            }
            if (hashSet.stream().anyMatch(hash -> hash.equals(input))) {
                System.out.println("Duplicate found");
            }
            hashSet.add(input);
        }
    }
}
