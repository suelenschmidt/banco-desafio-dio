package com.example;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setId("1");
        venilton.setNome("Venilton");

        ContaCorrente cc = new ContaCorrente(venilton);
        ContaPoupanca poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}