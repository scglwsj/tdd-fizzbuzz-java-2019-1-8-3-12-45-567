package com.thoughtworks.tdd;

public class Dependency {
    public String say() {
        return "Leave me alone.";
    }

    public String fizzBuzz(Integer i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 7 == 0) {
            return "Whizz";
        } else {
            return i.toString();
        }
    }
}
