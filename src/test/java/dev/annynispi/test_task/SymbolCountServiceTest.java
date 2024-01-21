package dev.annynispi.test_task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class SymbolCountServiceTest {

    @InjectMocks
    private SymbolCountService service;

    @Test
    void calculate(){
        String requestBody = "aaaabbbcccccc";
        Map<Character, Integer> testMap = service.calculate(requestBody);

        assertNotNull(testMap);
        assertEquals(3, testMap.size());
        assertEquals(6, testMap.get('c'));
        assertEquals(4, testMap.get('a'));
        assertEquals(3, testMap.get('b'));

    }
}