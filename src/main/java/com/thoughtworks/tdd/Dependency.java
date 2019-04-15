package com.thoughtworks.tdd;

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
    private FizzConverter converter3;
    private FizzConverter converter5;
    private FizzConverter converter7;

    FizzManager() {
        converter3 = new FizzConverter(3, "Fizz");
        converter5 = new FizzConverter(5, "Buzz");
        converter7 = new FizzConverter(7, "Whizz");
    }

    String getString(Integer i) {
        return converter3.getConverter(i)
                + converter5.getConverter(i)
                + converter7.getConverter(i);
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


