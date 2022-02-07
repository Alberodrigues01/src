package src.Exercicio_Modulo_8_Projeto_Banco;

import src.Exercicio_Modulo_8_Projeto_Banco.DB.ContaCorrenteDB;
import src.Exercicio_Modulo_8_Projeto_Banco.DB.ContaPoupancaDB;
import src.Exercicio_Modulo_8_Projeto_Banco.DB.ContaSalarioDB;
import src.Exercicio_Modulo_8_Projeto_Banco.DB.ClienteDB;
import java.util.Scanner;


public class ConsoleGerente {

    static ClienteDB clienteDB = new ClienteDB();
    static ContaCorrenteDB contaCorrenteDB = new ContaCorrenteDB();
    static ContaPoupancaDB contaPoupancaDB = new ContaPoupancaDB();
    static ContaSalarioDB contaSalarioDB = new ContaSalarioDB();

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("==================================");
            System.out.println("|   BANCO MENTORAMA - OPERAÇÕES  |");
            System.out.println("----------------------------------");
            System.out.println("|    1 - Criar Cliente    |");
            System.out.println("|    2 - Criar Conta      |");
            System.out.println("|    3 - Depositar        |");
            System.out.println("|    4 - Sacar            |");
            System.out.println("|    5 - Transferir       |");
            System.out.println("|    6 - Montante Contas  |");
            System.out.println("|    7 - Tributavel       |");
            System.out.println("|    8 - Listar Clientes  |");
            System.out.println("|    9 - Listar Contas    |");
            System.out.println("|    0 - Sair             |");
            System.out.println("==================================");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o código da operação: ");
            option = scanner.nextInt();

            process(option);

        } while (option != 0);
    }

    public static void process(int option) {

        switch (option) {

            case 1: {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Informe o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                //int numCliente = scanner.nextInt();

                Cliente novoCliente = new Cliente (nomeCliente);
                clienteDB.addnovoCliente(novoCliente);
                System.out.println("A identificação do cliente: " + novoCliente.getNumCliente());

                System.out.println("");

                break;
            }

            case 2: {

                System.out.println("Informe o tipo de conta a ser criada: ");
                System.out.println(" 1 para Conta Corrente ");
                System.out.println(" 2 para Conta Poupança ");
                System.out.println(" 3 para Conta Salário  ");

                Scanner scanner = new Scanner(System.in);
                int tipoConta = scanner.nextInt();

                if (tipoConta == 1) {
                    System.out.print("Informe o número da Conta Corrente: ");
                    int numeroConta = scanner.nextInt();
                    ContaCorrente novaContaCorrente = new ContaCorrente(tipoConta, numeroConta, 0.00);
                    contaCorrenteDB.addnovaContaCorrente(novaContaCorrente);
                    System.out.println("Conta Corrente (tipo " + tipoConta + ")" + " de número " + numeroConta + " criada com sucesso.");
                } else if (tipoConta == 2) {
                    System.out.print("Informe o número da Poupança: ");
                    int numeroConta = scanner.nextInt();
                    ContaPoupanca novaContaPoupanca = new ContaPoupanca(tipoConta, numeroConta, 0.00);
                    contaPoupancaDB.addnovaContaPoupanca(novaContaPoupanca);
                    System.out.println("Conta Poupança (tipo " + tipoConta + ")" + " de número " + numeroConta + " criada com sucesso.");
                } else if (tipoConta == 3) {
                    System.out.print("Informe o número da Conta Salário: ");
                    int numeroConta = scanner.nextInt();
                    ContaSalario novaContaSalario = new ContaSalario(tipoConta, numeroConta, 0.00);
                    contaSalarioDB.addnovaContaSalario(novaContaSalario);
                    System.out.println("Conta Salário (tipo " + tipoConta + ")" + " de número " + numeroConta + " criada com sucesso.");
                }
                break;
            }
            case 3: {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o TIPO de conta do DEPÓSITO: ");
                System.out.println(" 1 para Conta Corrente ");
                System.out.println(" 2 para Conta Poupança ");
                System.out.println(" 3 para Conta Salário  ");

                int tipoConta = scanner.nextInt();

                if (tipoConta == 1) {
                    System.out.print("Informe o NÚMERO da Conta Corrente do DEPÓSITO: ");
                    int numeroConta = scanner.nextInt();

                    ContaCorrente contaCorrente = contaCorrenteDB.getContaCorrentePorNumero(numeroConta);

                    System.out.print("Informe o VALOR do DEPÓSITO: ");
                    double valor = scanner.nextDouble();
                    contaCorrente.depositar(tipoConta, numeroConta, valor);

                    ContaCorrente novoSaldo = new ContaCorrente(tipoConta, numeroConta, contaCorrente.getSaldo());
                    contaCorrenteDB.addnovaContaCorrente(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrente.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 2) {

                    System.out.print("Informe o NÚMERO da Conta Poupança do DEPÓSITO: ");
                    int numeroConta = scanner.nextInt();

                    ContaPoupanca contaPoupanca = contaPoupancaDB.getContaPoupancaPorNumero(numeroConta);

                    System.out.print("Informe o VALOR do DEPÓSITO: ");
                    double valor = scanner.nextDouble();
                    contaPoupanca.depositar(tipoConta, numeroConta, valor);

                    ContaPoupanca novoSaldo = new ContaPoupanca(tipoConta, numeroConta, contaPoupanca.getSaldo());
                    contaPoupancaDB.addnovaContaPoupanca(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaPoupanca.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 3) {

                    System.out.print("Informe o NÚMERO da Conta Salário do DEPÓSITO: ");
                    int numeroConta = scanner.nextInt();

                    ContaSalario contaSalario = contaSalarioDB.getContaSalarioPorNumero(numeroConta);

                    System.out.print("Informe o VALOR do DEPÓSITO: ");
                    double valor = scanner.nextDouble();
                    contaSalario.depositar(tipoConta, numeroConta, valor);

                    ContaSalario novoSaldo = new ContaSalario(tipoConta, numeroConta, contaSalario.getSaldo());
                    contaSalarioDB.addnovaContaSalario(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaSalario.getSaldo());
                    System.out.println("-------------------------------------");
                }
                break;
            }

            case 4: {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o tipo de conta do SAQUE: ");
                System.out.println(" 1 para Conta Corrente ");
                System.out.println(" 2 para Conta Poupança ");
                System.out.println(" 3 para Conta Salário  ");

                int tipoConta = scanner.nextInt();

                if (tipoConta == 1) {
                    System.out.print("Informe o NÚMERO da Conta Corrente do SAQUE: ");
                    int numConta = scanner.nextInt();

                    ContaCorrente contaCorrente = contaCorrenteDB.getContaCorrentePorNumero(numConta);

                    System.out.print("Informe o VALOR do SAQUE: ");
                    double valor = scanner.nextDouble();
                    contaCorrente.sacar(tipoConta, numConta, valor);

                    ContaCorrente novoSaldo = new ContaCorrente(tipoConta, numConta, contaCorrente.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrente.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 2) {

                    System.out.print("Informe o NÚMERO da Conta Poupança do SAQUE: ");
                    int numConta = scanner.nextInt();

                    ContaPoupanca contaPoupanca = contaPoupancaDB.getContaPoupancaPorNumero(numConta);

                    System.out.print("Informe o VALOR do SAQUE: ");
                    double valor = scanner.nextDouble();
                    contaPoupanca.sacar(tipoConta, numConta, valor);

                    ContaPoupanca novoSaldo = new ContaPoupanca(tipoConta, numConta, contaPoupanca.saldo);
                    contaPoupancaDB.addnovaContaPoupanca(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaPoupanca.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 3) {

                    System.out.print("Informe o NÚMERO da Conta Salário do SAQUE: ");
                    int numConta = scanner.nextInt();

                    ContaSalario contaSalario = contaSalarioDB.getContaSalarioPorNumero(numConta);

                    System.out.print("Informe o VALOR do SAQUE: ");
                    double valor = scanner.nextDouble();
                    contaSalario.sacar(tipoConta, numConta, valor);

                    ContaSalario novoSaldo = new ContaSalario(tipoConta, numConta, contaSalario.saldo);
                    contaSalarioDB.addnovaContaSalario(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaSalario.getSaldo());
                    System.out.println("-------------------------------------");
                }
                break;
            }
            case 5: {

                Scanner scanner = new Scanner(System.in);
                System.out.println("ATENÇÃO: Só é possível realizar Transferência de CONTA CORRENTE para");
                System.out.println("outras Contas (Corrente - Poupança - Salário)");
                System.out.println("Informe o tipo de conta DESTINO: ");
                System.out.println(" 1 para Conta Corrente ");
                System.out.println(" 2 para Conta Poupança ");
                System.out.println(" 3 para Conta Salário  ");

                int tipoConta = scanner.nextInt();

                if (tipoConta == 1) {
                    System.out.print("Informe o NÚMERO da Conta Corrente TRANSFERÊNCIA SAÍDA: ");
                    int numeroContaOrigem = scanner.nextInt();

                    ContaCorrente contaCorrenteOrigem = contaCorrenteDB.getContaCorrenteOrigemPorNumero(numeroContaOrigem);

                    System.out.print("Informe o VALOR da TRANSFERÊNCIA SAÍDA: ");
                    double valor = scanner.nextDouble();
                    contaCorrenteOrigem.transferirSaida(tipoConta, numeroContaOrigem, valor);

                    ContaCorrente novoSaldoOrigem = new ContaCorrente(tipoConta, numeroContaOrigem, contaCorrenteOrigem.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldoOrigem);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrenteOrigem.getSaldo());
                    System.out.println("-------------------------------------");

                    System.out.print("Informe o número da Conta Corrente de Destino: ");
                    int numeroContaDestino = scanner.nextInt();

                    ContaCorrente contaCorrenteDestino = contaCorrenteDB.getContaCorrenteDestinoPorNumero(numeroContaDestino);
                    contaCorrenteDestino.transferirEntrada(tipoConta, numeroContaDestino, valor);

                    ContaCorrente novoSaldoDestino = new ContaCorrente(tipoConta, numeroContaDestino, contaCorrenteDestino.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldoDestino);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrenteDestino.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 2) {

                    System.out.print("Informe o NÚMERO da Conta Corrente TRANSFERÊNCIA SAÍDA: ");
                    int numeroContaOrigem = scanner.nextInt();

                    ContaCorrente contaCorrenteOrigem = contaCorrenteDB.getContaCorrenteOrigemPorNumero(numeroContaOrigem);

                    System.out.print("Informe o VALOR da TRANSFERÊNCIA SAÍDA: ");
                    double valor = scanner.nextDouble();
                    contaCorrenteOrigem.transferirSaida(tipoConta, numeroContaOrigem, valor);

                    ContaCorrente novoSaldoOrigem = new ContaCorrente(tipoConta, numeroContaOrigem, contaCorrenteOrigem.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldoOrigem);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrenteOrigem.getSaldo());
                    System.out.println("-------------------------------------");

                    System.out.print("Informe o número da Conta Poupança de Destino: ");
                    int numeroContaDestino = scanner.nextInt();

                    ContaPoupanca contaPoupancaDestino = contaPoupancaDB.getContaPoupancaDestinoPorNumero(numeroContaDestino);
                    contaPoupancaDestino.transferirEntrada(tipoConta, numeroContaDestino, valor);

                    ContaPoupanca novoSaldoDestino = new ContaPoupanca(tipoConta, numeroContaDestino, contaPoupancaDestino.saldo);
                    contaPoupancaDB.addnovaContaPoupanca(novoSaldoDestino);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaPoupancaDestino.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 3) {
                    System.out.print("Informe o NÚMERO da Conta Corrente TRANSFERÊNCIA SAÍDA: ");
                    int numeroContaOrigem = scanner.nextInt();

                    ContaCorrente contaCorrenteOrigem = contaCorrenteDB.getContaCorrenteOrigemPorNumero(numeroContaOrigem);

                    System.out.print("Informe o VALOR da TRANSFERÊNCIA SAÍDA: ");
                    double valor = scanner.nextDouble();
                    contaCorrenteOrigem.transferirSaida(tipoConta, numeroContaOrigem, valor);

                    ContaCorrente novoSaldoOrigem = new ContaCorrente(tipoConta, numeroContaOrigem, contaCorrenteOrigem.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldoOrigem);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaCorrenteOrigem.getSaldo());
                    System.out.println("-------------------------------------");

                    System.out.print("Informe o número da Conta Salário de Destino: ");
                    int numeroContaDestino = scanner.nextInt();

                    ContaSalario contaSalarioDestino = contaSalarioDB.getContaSalarioDestinoPorNumero(numeroContaDestino);
                    contaSalarioDestino.transferirEntrada(tipoConta, numeroContaDestino, valor);

                    ContaSalario novoSaldoDestino = new ContaSalario(tipoConta, numeroContaDestino, contaSalarioDestino.saldo);
                    contaSalarioDB.addnovaContaSalario(novoSaldoDestino);
                    System.out.println("-------------------------------------");
                    System.out.println("O novo saldo da conta é :" + contaSalarioDestino.getSaldo());
                    System.out.println("-------------------------------------");
                }
                break;
            }

            case 6: {

                System.out.println("-- SALDO TOTAL DE TODAS AS CONTAS --");
                System.out.println(" Valor de: " + (contaCorrenteDB.getSomarSaldoContaCorrente() + contaPoupancaDB.getSomarSaldoContaPoupanca() + contaSalarioDB.getSomarSaldoContaSalario()));
                System.out.println("==================================");

                break;
            }

            case 7: {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o tipo de conta a ser aplicado o TRIBUTAVEL: ");
                System.out.println(" 1 para Conta Corrente ");
                System.out.println(" 2 para Conta Poupança ");
                System.out.println(" 3 para Conta Salário  ");

                int tipoConta = scanner.nextInt();

                if (tipoConta == 1) {
                    System.out.print("Informe o NÚMERO da Conta Corrente para aplicar TRIBUTAVEL: ");
                    int numeroConta = scanner.nextInt();

                    ContaCorrente contaCorrente = contaCorrenteDB.getContaCorrentePorNumero(numeroConta);

                    contaCorrente.calcularTributavel();

                    ContaCorrente novoSaldo = new ContaCorrente(tipoConta, numeroConta,contaCorrente.saldo);
                    contaCorrenteDB.addnovaContaCorrente(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("Tributo retido sobre o saldo da conta: " + contaCorrente.valorImposto);
                    System.out.println("O novo saldo da conta é :" + contaCorrente.getSaldo());
                    System.out.println("-------------------------------------");

                } else if (tipoConta == 2) {

                    System.out.println("Conta Poupança NÃO aplica TRIBUTÁVEL ");
                    System.out.println(" Insira uma nova opção do MENU");
                    System.out.println("-------------------------------------");

                    } else if (tipoConta == 3) {

                    System.out.print("Informe o NÚMERO da Conta Salário para aplicar TRIBUTÁVEL: ");
                    int numConta = scanner.nextInt();

                    ContaSalario contaSalario = contaSalarioDB.getContaSalarioPorNumero(numConta);

                    contaSalario.calcularTributavel();

                    ContaSalario novoSaldo = new ContaSalario(tipoConta, numConta, contaSalario.saldo);
                    contaSalarioDB.addnovaContaSalario(novoSaldo);
                    System.out.println("-------------------------------------");
                    System.out.println("Tributo retido sobre o saldo da conta: " + contaSalario.valorImposto);
                    System.out.println("O novo saldo da conta é :" + contaSalario.getSaldo());
                    System.out.println("-------------------------------------");
                }
                break;
            }
            case 8: {
                System.out.println("===== LISTAR CLIENTES =====");
                for (Cliente cliente : clienteDB.getClienteList()) {
                    System.out.println(cliente.getNumCliente() + " - " + cliente.nomeCliente);
                    System.out.println("-----------------------------");
                }
                break;
            }

            case 9: {
                System.out.println("===== LISTAR CONTAS =====");
                for (ContaCorrente contaCorrente : contaCorrenteDB.getcontaCorrente()) {
                    System.out.println(contaCorrente.getTipoConta() + " - " + contaCorrente.getNumeroConta());
                    for (ContaPoupanca contaPoupanca : contaPoupancaDB.getcontaPoupanca()) {
                        System.out.println(contaCorrente.getTipoConta() + " - " + contaCorrente.getNumeroConta());
                        for (ContaSalario contaSalario : contaSalarioDB.getcontaSalario()) {
                            System.out.println(contaSalario.getTipoConta() + " - " + contaSalario.getNumeroConta());
                            System.out.println("-----------------------------");
                        }
                        break;
                    }
                }
            }
        }
    }
}










