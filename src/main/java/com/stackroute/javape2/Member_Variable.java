package com.stackroute.javape2;

public class Member_Variable {
    // create object of member class
    Member objMember =new Member();

    // set value to variables of member class
    public void setVariables() {
        objMember.setName("Shubhi");
        objMember.setAge(22);
        objMember.setSalary(27500);
    }

    // display message using getter
    public String display(){
    return "name is "+ objMember.getName() +" age is "+ objMember.getAge() +" salary is "+ objMember.getSalary();
    }
}
