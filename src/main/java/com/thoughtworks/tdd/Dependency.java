package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dependency {
    private static FizzManager fizzManager;

    public Dependency() {
        fizzManager = new FizzManager();
    }

    public String say() {
        return "Leave me alone.";
    }

    public String fizzBuzz(Integer i) {
        return fizzManager.getResult(i);
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

    String getResult(Integer i) {
        String s = converters.stream()
                .map(converter -> converter.getConverter(i))
                .collect(Collectors.joining());
        return s.isEmpty() ? i.toString() : s;
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


