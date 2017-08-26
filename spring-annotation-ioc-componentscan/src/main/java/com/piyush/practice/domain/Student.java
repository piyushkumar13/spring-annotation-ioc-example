package com.piyush.practice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pkumar on 8/26/17.
 */

@Component
public class Student {

    private int rollNo;
    private String name;
    private String collegeName;

    @Autowired
    private Address address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (rollNo != student.rollNo) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (collegeName != null ? !collegeName.equals(student.collegeName) : student.collegeName != null) return false;
        return address != null ? address.equals(student.address) : student.address == null;
    }

    @Override
    public int hashCode() {
        int result = rollNo;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (collegeName != null ? collegeName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", address=" + address +
                '}';
    }
}
