package dev.annynispi.test_task;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SymbolCountService {

    public Map<Character, Integer> calculate(String inputString){

        Map<Character, Integer> resultMap = new HashMap<>();

        for (Character character : inputString.toCharArray()) {
            resultMap.put(character, resultMap.getOrDefault(character, 0) + 1);
        }

        return resultMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
    }
}
