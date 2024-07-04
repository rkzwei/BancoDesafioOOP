package Banco.Clientes.PJ;

public class ClientePJ extends Banco.Clientes.Cliente {

    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "CNPJ='" + CNPJ + '\'' +
                '}';
    }
}
