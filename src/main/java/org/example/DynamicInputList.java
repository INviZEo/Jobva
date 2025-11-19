package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInputList {
    public void scannerInput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("стоп")) {
                System.out.println(list);
                break;
            }
            list.add(input);
        }
    }
}
