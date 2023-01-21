package com.example.s24267Bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {
    private ClientStorage clientStorage;

    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    public void registerClient(int id, int saldo) {
        List<Client> clientList = clientStorage.getClientList();
        for (Client client : clientList) {
            if (id == client.getId()) {
                System.out.println("klient o podanym id istnieje!");
                return;
            }
            clientStorage.getClientList().add(new Client(id, saldo));
        System.out.println("Uzytkownik o id: " + id + " został dodany z saldem: " + saldo);
    }}

    public int currentMoney(int id) {
        List<Client> clientList = clientStorage.getClientList();
        for (Client client : clientList) {
            if (id == client.getId()) {
                return client.getSaldo();
            }
        }
        return 1;
    }

    public Info przelej(int id, int kwota) {
        List<Client> clientList = clientStorage.getClientList();

        for (Client client : clientList) {
            if (id == client.getId()) {
                int dostepne = client.getSaldo();
                if (dostepne - kwota < 0) {
                    System.out.println("za malo na koncie!");
                    return new Info(currentMoney(id), Status.DECLINED);
                }
                client.setSaldo(dostepne - kwota);
                System.out.println("Klient o id: " + id + ". Przelal: " + kwota + ". Obecne saldo: " + client.getSaldo());
            } else {
                System.out.println("Klient nie istnieje!");
                return new Info(currentMoney(id), Status.DECLINED);
            }
        }
        return new Info(currentMoney(id), Status.ACCEPTED);
    }

    public Info wplac(int id, int kwota) {
        List<Client> clientList = clientStorage.getClientList();
        for (Client client : clientList) {
            if (id == client.getId()) {
                int saldo = client.getSaldo();
                client.setSaldo(saldo + kwota);
                System.out.println("Saldo powiekszone o " + kwota);
                return new Info(currentMoney(id), Status.ACCEPTED);
            }
        }
        System.out.println("Uzytkownik o podanym id nie istnieje!");
        return new Info(0, Status.DECLINED);
    }

    public void getClientData(int id) {
        List<Client> clientList = clientStorage.getClientList();
        for (Client client : clientList) {
            if (id == client.getId()) {
                System.out.println("ID: " + client.getId() + " Saldo: " + client.getSaldo());
            }
        }
    }
}