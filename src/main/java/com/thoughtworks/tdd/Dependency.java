package com.thoughtworks.tdd;

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


