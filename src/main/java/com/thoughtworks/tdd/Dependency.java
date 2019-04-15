package com.thoughtworks.tdd;

public class Dependency {
    public String say() {
        return "Leave me alone.";
    }

    public String fizzBuzz(Integer i) {
        String result = "";

        if (i % 3 == 0) {
            result += "Fizz";
        }

        if (i % 5 == 0) {
            result += "Buzz";

        }

        if (i % 7 == 0) {
            result += "Whizz";

        }

        if (result.isEmpty()) {
            return i.toString();
        } else {
            return result;
        }
    }
}
