package com.corejava;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    Person(String name, int age) {
        super();
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        return this.age > p.age ? -1 : p.age < this.age ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Person {age= " + this.age + "name=" + this.name + "}";

    }

}