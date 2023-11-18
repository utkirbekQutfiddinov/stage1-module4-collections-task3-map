package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result=new HashMap<>();
        int old;

        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()){
            if(!result.containsKey(entry.getValue())){
                result.put(entry.getValue(),entry.getKey());
            }else {
                old=result.get(entry.getValue());
                if(old>entry.getKey()){
                    result.put(entry.getValue(),entry.getKey());
                }
            }
        }

        return result;
    }
}
