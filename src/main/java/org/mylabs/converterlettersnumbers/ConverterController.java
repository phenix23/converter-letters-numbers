package org.mylabs.converterlettersnumbers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ConverterController {

    private final MainConverterNumbersToLetters converter;

    public ConverterController(MainConverterNumbersToLetters converter) {
        this.converter = converter;
    }

    @PostMapping("/converter")
    public String convertNumberToString(@RequestBody Map<String, String> input) {
        return converter.convertNumbreToString(input.get("number"));
    }

}
