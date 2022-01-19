package Exercicio_Modulo7_Conta;

public class OperaConta {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("***** OPERAÇÕES DE CONTA CORRENTE *****");

        ContaCorrente contaCorrente = new ContaCorrente(22, 1, "Dinheiro Fácil",
                0.0, 1000.00);

        contaCorrente.depositar(500.00);

        System.out.println("Operação de Conta Corrente: depósito realizado no valor de R$ 500,00");
        System.out.println("O saldo da conta é " + contaCorrente.getSaldo());
        System.out.println("O limite para saque é " + contaCorrente.getChequeEspecial());

        contaCorrente.saldo = contaCorrente.getLimiteSaque();

        fazSaque(contaCorrente, 400.00);
        fazSaque(contaCorrente, 1300.00);


        System.out.println("");
        System.out.println("***** OPERAÇÕES DE CONTA POUPANÇA *****");

        ContaPoupanca contaPoupanca = new ContaPoupanca(33, 3, "Dinheiro Fácil",
                100.0);

        contaPoupanca.calcularRendimento(5, 0.05);
        System.out.println("Valor de JUROS adicionados no mês: " + contaPoupanca.getValorJuros());
        System.out.println("O saldo da Conta Poupança é de: " + contaPoupanca.getSaldo());

        System.out.println("--------------------------------------------------");
        contaPoupanca.calcularRendimento(19, 0.05);
        System.out.println("Valor de JUROS adicionados no mês: " + contaPoupanca.getValorJuros());
        System.out.println("O saldo da Conta Poupança é de: " + contaPoupanca.getSaldo());

        System.out.println("");
        System.out.println("***** OPERAÇÕES DE CONTA SALÁRIO *****");

        ContaSalario contaSalario = new ContaSalario(44, 4, "Dineiro Fácil",
                1000.00);

        contaSalario.fazerTransf(1, 400.00);
        System.out.println("--------------------------------------------------");
        contaSalario.fazerTransf(3, 500.00);
        System.out.println("--------------------------------------------------");
        contaSalario.fazerTransf(2, 700.00);
    }
    public static void fazSaque(Conta saque, double valor) {

        System.out.println("--------------------------------------------------");

        if (saque.sacar(valor)) {
            System.out.println("Operação de Conta Corrente: saque realizado com SUCESSO !");
            System.out.println("O saldo em Conta Corrente + Cheque Especial é de: " + saque.getSaldo());
        } else {
            System.out.println("Operação de Conta Corrente: Saldo INSUFICIENTE para o valor do saque !");
            System.out.println("O saldo em Conta Corrente + Cheque Especial é de: " + saque.getSaldo());
        }
    }
}

