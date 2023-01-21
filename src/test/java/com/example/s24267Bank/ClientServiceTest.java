package com.example.s24267Bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BooleanSupplier;

public class ClientServiceTest {
    private ClientStorage clientStorage = new ClientStorage();
    private ClientService clientService = new ClientService(clientStorage);


    @Test
    void canRegister(){
        clientService.registerClient(5,200);
        Assertions.assertTrue(clientStorage.getClientList().size()==5,"Nie udało sie zarejstrować. Id już istnieje.");
    }

}