package Banco;

import Banco.Contas.Conta;

import java.util.HashSet;
import java.util.List;

public class Banco {

    private String nome;
    private static HashSet<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashSet<Conta> getContas() {
        return contas;
    }

    public void setContas(HashSet<Conta> contas) {
        Banco.contas = contas;
    }

    public static void addConta(Conta conta) {
        contas.add(conta);
    }



}