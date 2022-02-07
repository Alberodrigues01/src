package src.Exercicio_Modulo_8_Projeto_Banco.DB;

import src.Exercicio_Modulo_8_Projeto_Banco.ContaPoupanca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaPoupancaDB {

        private Map<Integer, ContaPoupanca> contaPoupancaDBMap = new HashMap<>();

        public Map <Integer , ContaPoupanca >getContaPoupancaDBMap (){
            return contaPoupancaDBMap;
        }

        public List<ContaPoupanca> getcontaPoupanca(){
            List <ContaPoupanca> contasPoupancas = new ArrayList<>();
            for(Map.Entry<Integer , ContaPoupanca> contaPoupanca : contaPoupancaDBMap.entrySet()){
                contasPoupancas.add(contaPoupanca.getValue());
            }
            return contasPoupancas;

        }

        public void addnovaContaPoupanca(ContaPoupanca contaPoupanca){
            contaPoupancaDBMap.put(contaPoupanca.getNumeroConta() , contaPoupanca);
        }

        public ContaPoupanca getContaPoupancaPorNumero(int numeroConta){
            return contaPoupancaDBMap.get(numeroConta);
        }

        public double getSomarSaldoContaPoupanca() {

            List<ContaPoupanca> totalSaldoContasPoupancas = new ArrayList<>();
            double somarSaldoContasPoupancas = 0;
            for (Map.Entry<Integer, ContaPoupanca> contaPoupanca : contaPoupancaDBMap.entrySet()) {
                somarSaldoContasPoupancas += contaPoupanca.getValue().saldo;
            }
            return somarSaldoContasPoupancas;
        }

        public ContaPoupanca getContaPoupancaDestinoPorNumero(int numeroContaDestino){
        return contaPoupancaDBMap.get(numeroContaDestino);
    }
}
