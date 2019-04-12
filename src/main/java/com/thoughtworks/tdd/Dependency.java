package com.thoughtworks.tdd;

public class Dependency {
    public String say() {
        return "Leave me alone.";
    }

    public String fizzBuzz(Integer i) {
        if (i == 3) {
            return "Fizz";
        } else if (i == 5) {
            return "Buzz";
        } else {
            return i.toString();
        }
    }
}
