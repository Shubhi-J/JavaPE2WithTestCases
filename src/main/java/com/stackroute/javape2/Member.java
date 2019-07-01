package com.stackroute.javape2;

public class Member {
    private String name;
    private int age;
    private float salary;

    //Setter
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setSalary(float salary) {
        this.salary=salary;
    }

    //Getter
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
