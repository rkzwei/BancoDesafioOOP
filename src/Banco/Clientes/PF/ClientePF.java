package Banco.Clientes.PF;

public class ClientePF extends Banco.Clientes.Cliente {
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "CPF='" + CPF + '\'' +
                '}';
    }
}
