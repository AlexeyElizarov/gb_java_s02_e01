package team;


import java.util.Random;

public class Member {

    private final String name;
    private boolean isPassed = false;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public boolean isPassed() {
        return isPassed;
    }
}

