package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
