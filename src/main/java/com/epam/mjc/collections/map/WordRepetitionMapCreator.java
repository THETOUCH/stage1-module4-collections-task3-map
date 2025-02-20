package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<>();
        } else {
            Map<String, Integer> map = new HashMap<>();
            List<String> strings = List.of(sentence
                    .replaceAll("[!?;,.:-]", "")
                    .toLowerCase()
                    .split(" ")
            );
            strings.forEach(s -> map.put(s, Collections.frequency(strings, s)));
            return map;
        }
    }
}
