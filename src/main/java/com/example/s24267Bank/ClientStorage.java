package com.example.s24267Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClientStorage {
    private Client dawid = new Client(1, 100);
    private Client adam = new Client(2, 200);
    private Client olek = new Client(3, 300);
    private Client alicja = new Client(4, 400);

    private List<Client> clientList = new ArrayList<>();


    public ClientStorage() {
        clientList.add(dawid);
        clientList.add(adam);
        clientList.add(olek);
        clientList.add(alicja);
    }
    public List<Client> getClientList() {
        return clientList;
    }
}
