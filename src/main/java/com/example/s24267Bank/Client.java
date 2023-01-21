package com.example.s24267Bank;

import org.springframework.stereotype.Component;

public class Client {
    private int id;
    private int saldo;

    public Client(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
