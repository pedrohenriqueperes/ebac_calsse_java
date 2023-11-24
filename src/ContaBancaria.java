public class ContaBancaria {
    // Nome do Correntista
    String titular;
    //Conta corrente ou Poupança
    String tipoDeConta;
    Float saldo;
    Boolean acesso = true;

    public ContaBancaria(String titular, String tipoDeConta, Float saldo) {
        this.titular = titular;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(Boolean acesso) {
        this.acesso = acesso;
    }


}
