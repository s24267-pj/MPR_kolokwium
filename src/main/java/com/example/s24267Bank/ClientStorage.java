package com.example.s24267Bank;

import java.util.ArrayList;
import java.util.List;

public class ClientStorage {
    private Client dawid = new Client(1, 100);
    private Client adam = new Client(2, 200);
    private Client olek = new Client(3, 300);
    private Client alicja = new Client(4, 400);

    public List<Client> clientList = new ArrayList<>();

    public List<Client> getClientList() {
        return clientList;
    }


    public ClientStorage() {
        clientList.add(dawid);
        clientList.add(adam);
        clientList.add(olek);
        clientList.add(alicja);

    }
}
