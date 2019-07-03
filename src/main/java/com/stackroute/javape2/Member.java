package com.stackroute.javape2;

public class Member {
    // define properties
    private String name;
    private int age;
    private float salary;

    // generate setter
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setSalary(float salary) {
        this.salary=salary;
    }

    // generate getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getSalary() {
        return salary;
    }
}
