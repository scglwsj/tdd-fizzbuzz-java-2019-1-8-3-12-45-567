package com.thoughtworks.tdd;

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
