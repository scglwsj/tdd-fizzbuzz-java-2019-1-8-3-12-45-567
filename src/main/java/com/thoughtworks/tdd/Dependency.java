package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dependency {
    public String say() {
        return "Leave me alone.";
    }

    public String fizzBuzz(Integer i) {
        FizzManager manager = new FizzManager();
        String result = manager.getString(i);
        return result.isEmpty() ? i.toString() : result;
    }
}

class FizzManager {
    private List<FizzConverter> converters;

    FizzManager() {
        converters = new ArrayList<>();
        converters.add(new FizzConverter(3, "Fizz"));
        converters.add(new FizzConverter(5, "Buzz"));
        converters.add(new FizzConverter(7, "Whizz"));
    }

    String getString(Integer i) {
        return converters.stream()
                .map(converter -> converter.getConverter(i))
                .collect(Collectors.joining());
    }
}

class FizzConverter {
    private Integer divisor;
    private String converter;

    FizzConverter(Integer divisor, String converter) {
        this.divisor = divisor;
        this.converter = converter;
    }

    String getConverter(Integer dividend) {
        return dividend % divisor == 0 ? converter : "";
    }
}


