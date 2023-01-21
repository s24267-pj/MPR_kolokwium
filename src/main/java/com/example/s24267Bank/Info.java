package com.example.s24267Bank;

public class Info {
    private Status status;

    private int ilosc;
    public Info(int ilosc, Status status) {
        this.status = status;
        this.ilosc = ilosc;
    }

    public Status getStatus() {
        return status;
    }


}
