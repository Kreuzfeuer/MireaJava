package com.Mirea41.work7;

public class LearnerTest {
    public static void main(String[] args) {
        Learner[] mans = new Learner[3];
        mans[0] = new Learner("Oleg");
        mans[1] = new Pupil("Kirill");
        mans[2] = new Student("Tver");
        for (int i = 0; i < 3; i++) {
            System.out.println(mans[i]);
        }
    }
}
