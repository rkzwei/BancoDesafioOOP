package Banco;


import Banco.Clientes.PF.ClientePF;
import Banco.Clientes.PJ.ClientePJ;
import Banco.Contas.Conta;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Banco bancoRK = new Banco();

        bancoRK.setNome("BancoRK");
        bancoRK.setContas(new HashSet<>());
        HashSet<Conta> contas = bancoRK.getContas();
        ClientePF rkzwei = new ClientePF();
        rkzwei.setNome("Rkzwei");
        rkzwei.setCPF("123.456.789-10");

        Conta cc = new ContaCorrente(rkzwei);
        Conta poupanca = new ContaPoupanca(rkzwei);

        ClientePJ rkzweiPJ = new ClientePJ();
        rkzweiPJ.setNome("RkzweiPJ");
        rkzweiPJ.setCNPJ("123.456.789/0001-10");
        Conta ccPJ = new ContaCorrente(rkzweiPJ);
        contas.add(ccPJ);

        cc.depositar(100);
        cc.sacar(50);
        cc.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("=== Total de contas: " + contas.size() + " ===");
        contas.forEach(System.out::println);
    }

}
