package Exercicio_Modulo7_Conta;

public class ContaSalario extends Conta {

    private int qtdTransfMes;
    private double valorTransf;

    public ContaSalario(int numero, int agencia, String banco, double saldo) {
       super(numero, agencia, banco, saldo);
        this.qtdTransfMes = qtdTransfMes;
        this.valorTransf = valorTransf;
    }
        public double getSaldo () {
            return this.saldo;
        }
        public void fazerTransf( int qtdTransfMes, double valorTransf) {
            if (qtdTransfMes <= 2 && valorTransf <= saldo) {
                saldo -= valorTransf;
                System.out.println("Transferência para Conta Corrente realizada no valor de: " + valorTransf);
                System.out.println("O saldo da Conta Salário é de: " + getSaldo());
            }
            else if (qtdTransfMes<=2 && valorTransf > saldo){
                System.out.println("Transferência para Conta Corrente não realizada. Saldo INSUFICIENTE.");

            } else {
                System.out.println("Transferência para Conta Corrente não realizada. Já realizou o NÚMERO de transferências pemitidas no mês.");
                            }
        }
        public int getQtdTransfMes () {
            return qtdTransfMes;
        }

        public void setQtdTransfMes ( int qtdTransfMes){
            this.qtdTransfMes = qtdTransfMes;
        }

        public double getValorTransf () {
            return valorTransf;
        }

        public void setValorTransf ( double valorTransf){
            this.valorTransf = valorTransf;
        }

        @Override
        public String toString () {
            return "ContaSalario{" +
                    "saldo=" + saldo +
                    ", qtdTransfMes=" + qtdTransfMes +
                    ", valorTransf=" + valorTransf +
                    '}';

        }
}

