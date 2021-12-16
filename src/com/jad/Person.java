package com.jad;

public class Person implements IHasKey {
    private String name;
    private int age;


    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int getKey() {
        return this.getAge();
    }
}
