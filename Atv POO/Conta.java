public class Conta {
    private String numeroConta;
    private String agencia;
    
    public Conta(String numeroConta, String agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
}
