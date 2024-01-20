package dev.annynispi.test_task;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SymbolCountService {

    public Map<Character, Integer> calculate(String inputString){

        Map<Character, Integer> newMap = new HashMap<>();

        for (Character character : inputString.toCharArray()) {
            newMap.put(character, newMap.getOrDefault(character, 0) + 1);
        }

        return newMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
    }
}
