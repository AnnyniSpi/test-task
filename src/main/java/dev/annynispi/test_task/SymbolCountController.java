package dev.annynispi.test_task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/calculator")
public class SymbolCountController {

    private final SymbolCountService symbolCountService;

    public SymbolCountController(SymbolCountService symbolCountService) {
        this.symbolCountService = symbolCountService;
    }

    @PostMapping
    public ResponseEntity<Map<Character, Integer>> calculateSymbolCount(@RequestBody String requestBody){
        return new ResponseEntity<>(symbolCountService.calculate(requestBody), HttpStatus.OK);

    }
}
