package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchInList {
    public void searchInList() {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("Misha", "Kirill", "Gregory"));
        String word = input.nextLine();

        for (String s : list) {
            if (word.contains(s)) {
                System.out.println("Найдёно " + s);
            } else {
                System.out.println("Не найдено " + s);
            }
        }
    }
}