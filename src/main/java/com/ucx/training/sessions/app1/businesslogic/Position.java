package com.ucx.training.sessions.app1.businesslogic;

public enum Position {
    PROGRAMMER(1), QA(2), PM(10);

    private final double payPerHour;

    Position(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public double getPayPerHour() {
        return payPerHour;
    }
}
