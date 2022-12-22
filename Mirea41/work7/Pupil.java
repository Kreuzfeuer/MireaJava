package com.Mirea41.work7;

public class Pupil extends Learner{
    public Pupil(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
