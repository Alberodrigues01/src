package src.Exercicio_Modulo_8_Projeto_Banco;

public abstract class BancoConta {

    private int tipoConta;
    private int numeroConta;
    public double saldo;
    private int numeroContaOrigem = numeroConta;
    private int numeroContaDestino = numeroConta;


    public BancoConta(int tipoConta, int numeroConta, double saldo) {
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(int tipoConta, int numeroConta, double valor) {

        saldo += valor;
    }

    public boolean sacar(int tipoConta, int numeroConta, double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferirSaida(int TipoConta, int NumeroContaOrigem, double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public void transferirEntrada(int TipoConta, int NumeroContaDestino, double valor) {

        saldo += valor;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

}





