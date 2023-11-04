package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        int t = 0;
        for (Map.Entry<Integer, Integer> e : functionMap.entrySet()) {
            if (e.getValue() == requiredValue) {
                t=1;
            }
        }
        return t == 1;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> returnMap = new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++) {
            returnMap.put(sourceList.get(i), 5*sourceList.get(i)+2);
        }
        return returnMap;
    }
}
