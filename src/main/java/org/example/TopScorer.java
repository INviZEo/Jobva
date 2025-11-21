package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopScorer {
    public void bigBallsMan() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Gir", 181);
        hashMap.put("Kas", 13);
        hashMap.put("Cod", 1811);
        hashMap.put("Lyc", 551);

        System.out.println(Collections.max(hashMap.entrySet(),
                Map.Entry.comparingByValue()));
    }
}
