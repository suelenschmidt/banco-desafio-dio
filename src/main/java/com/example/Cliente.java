package com.example;

import java.util.List;

import lombok.Data;

@Data
public class Cliente {
    private String id;
    private String nome;
    private List<Conta> contas;
}