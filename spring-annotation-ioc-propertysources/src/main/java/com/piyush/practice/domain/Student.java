package com.piyush.practice.domain;

/**
 * Created by pkumar on 8/27/17.
 */
public class Student {

    private int rollNo;
    private String name;
    private String collegeName;

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
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
