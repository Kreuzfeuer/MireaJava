package com.Mirea2.Work1;

import java.util.Objects;

public class Computer {

    private String userName = "Default";

    public Computer(String userName) {
        this.userName = userName;
    }

    public Computer() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(userName, computer.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

}
