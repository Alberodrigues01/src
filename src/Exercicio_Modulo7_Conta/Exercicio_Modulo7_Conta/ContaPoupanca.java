package src.Exercicio_Modulo7_Conta;

import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;
    private double valorJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
        this.valorJuros = valorJuros;
    }

   public boolean calcularRendimento(int diaAniversario , double taxaDeJuros) {
        Calendar hoje = Calendar.getInstance();
        if (diaAniversario == hoje.get(Calendar.DAY_OF_MONTH)){
            valorJuros = saldo * taxaDeJuros;
            saldo += valorJuros;
            return true;
            }
        else {
            return false;
        }
     }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(double valorJuros) {
        this.valorJuros = valorJuros;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + saldo +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
