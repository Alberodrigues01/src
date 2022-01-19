package Exercicio_Modulo7_Conta;

public class ContaCorrente extends Conta {

        private double chequeEspecial;
        private double limiteSaque;

        public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
                super(numero, agencia, banco, saldo);
                this.chequeEspecial = chequeEspecial;
        }
        public double getSaldo() {
                return this.saldo;
        }
        public double getChequeEspecial() {
                return this.chequeEspecial;
        }
        public double getLimiteSaque() {
                return limiteSaque = this.chequeEspecial + this.saldo;
        }
}











