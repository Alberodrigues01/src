package src.Exercicio_Modulo_8_Projeto_Banco;

public class ContaSalario extends BancoConta implements Tributavel {

    private int qtdTransfMes;
    private double valorTransf;
    double aliquotaImposto = 0.01;            ;
    double valorImposto = getSaldo()*aliquotaImposto;
    double novoSaldo = saldo - valorImposto;

    public ContaSalario(int tipoConta, int numeroConta, double saldo) {
        super(tipoConta, numeroConta, saldo);
        this.qtdTransfMes = qtdTransfMes;
        this.valorTransf = valorTransf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void fazerTransf(int qtdTransfMes, double valorTransf) {
        if (qtdTransfMes <= 2 && valorTransf <= saldo) {
            saldo -= valorTransf;
            System.out.println("Transferência para Conta Corrente realizada no valor de: " + valorTransf);
            System.out.println("O saldo da Conta Salário é de: " + getSaldo());
        } else if (qtdTransfMes <= 2 && valorTransf > saldo) {
            System.out.println("Transferência para Conta Corrente não realizada. Saldo INSUFICIENTE.");

        } else {
            System.out.println("Transferência para Conta Corrente não realizada. Já realizou o NÚMERO de transferências pemitidas no mês.");
        }
    }


    public int getQtdTransfMes() {
        return qtdTransfMes;
    }

    public void setQtdTransfMes(int qtdTransfMes) {
        this.qtdTransfMes = qtdTransfMes;
    }

    public double getValorTransf() {
        return valorTransf;
    }

    public void setValorTransf(double valorTransf) {
        this.valorTransf = valorTransf;
    }

    @Override
    public double calcularTributavel() {
        return saldo = novoSaldo;
    }
}


