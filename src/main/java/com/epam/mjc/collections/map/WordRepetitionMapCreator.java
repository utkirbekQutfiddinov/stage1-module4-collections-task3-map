package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> result=new HashMap<>();
        sentence=sentence.replaceAll("[.,]","");
        String[] words=sentence.split("[ ]");
        int c;
        for (String word : words) {
            if (word.isEmpty()){
                continue;
            }
            c=result.getOrDefault(word.toLowerCase(),0);
            result.put(word.toLowerCase(),c+1);
        }
        return result;
    }
}
