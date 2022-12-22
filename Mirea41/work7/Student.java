package com.Mirea41.work7;

public class Student extends Learner{
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
