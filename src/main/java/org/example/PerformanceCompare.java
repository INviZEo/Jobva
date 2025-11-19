package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceCompare {
    public void timeTemp() {
        double timeArr = System.nanoTime();
        List<Integer> listArr = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            listArr.addFirst(i);
            if (i == 10000) {
                System.out.println("Time on 10000 iteration ArrayList = "
                        + (System.nanoTime() - timeArr));
                break;
            }
        }

        double timeLink = System.nanoTime();
        List<Integer> listLink = new LinkedList<>();
        for (int i = 0; i <= 100000; i++) {
            listLink.addFirst(i);
            if (i == 10000) {
                System.out.println("Time on 10000 iteration LinkedList = " +
                        (System.nanoTime() - timeLink));
                break;
            }
        }

    }
}
