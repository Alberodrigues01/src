package src.Exercicio_Modulo_8_Projeto_Banco;

public class ContaCorrente extends BancoConta implements Tributavel{

    private double chequeEspecial;
    private double limiteSaque;
    double aliquotaImposto = 0.01;            ;
    double valorImposto = getSaldo()*aliquotaImposto;
    double novoSaldo = saldo - valorImposto;


    public ContaCorrente(int tipoConta, int numeroConta, double saldo) {

        super(tipoConta, numeroConta, saldo);
    }


    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

     @Override

    public double calcularTributavel() {
        return saldo = novoSaldo;

    }
}


