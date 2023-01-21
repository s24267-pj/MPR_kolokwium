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
        clientStorage.getClientList().add(new Client(id, saldo));
        System.out.println("Uzytkownik o id: " + id + " został dodany z saldem: " + saldo);
    }

    public void przelej(int id, int kwota) {
        List<Client> clientList = clientStorage.getClientList();

        for (Client client : clientList) {
            if (id == client.getId()) {
                int dostepne = client.getSaldo();
                client.setSaldo(dostepne - kwota);
            }
            System.out.println("Klient o id: " + id + ". Przelal: " + kwota + ". Obecne saldo: " + client.getSaldo());
            return;
        }

    }
}
