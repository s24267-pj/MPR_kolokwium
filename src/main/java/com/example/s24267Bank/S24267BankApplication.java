package com.example.s24267Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24267BankApplication {
    private ClientService clientService;

    public S24267BankApplication(ClientService clientService) {
        this.clientService = clientService;
        clientService.registerClient(7, 200);
        clientService.przelej(1,520);
        clientService.getClientData(2);
        clientService.wplac(2,300);
        clientService.getClientData(2);

    }

    public static void main(String[] args) {
        SpringApplication.run(S24267BankApplication.class, args);
    }

}
