package com.stackroute.javape2;

public class Member_Variable {
    Member objMember =new Member();

    public void setVariables() {
        objMember.setName("Shubhi");
        objMember.setAge(22);
        objMember.setSalary(27500);
    }

    public String display(){
    return "name is "+ objMember.getName() +" age is "+ objMember.getAge() +" salary is "+ objMember.getSalary();
    }
}
