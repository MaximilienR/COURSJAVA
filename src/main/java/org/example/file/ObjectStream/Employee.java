package org.example.file.ObjectStream;

import java.io.Serializable;

public class Employee implements Serializable {

    private  String fullName;

    private float salary;

    public  Employee(String fullName,float salary){
        this.fullName=fullName;
        this.salary=salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
