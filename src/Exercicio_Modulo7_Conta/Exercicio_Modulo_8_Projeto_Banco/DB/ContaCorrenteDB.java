package src.Exercicio_Modulo_8_Projeto_Banco.DB;

import src.Exercicio_Modulo_8_Projeto_Banco.ContaCorrente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaCorrenteDB {

        private Map<Integer, ContaCorrente> contaCorrenteDBMap = new HashMap<>();

        public Map <Integer , ContaCorrente >getContaCorrenteDBMap (){
            return contaCorrenteDBMap;
        }

        public List<ContaCorrente> getcontaCorrente(){
            List <ContaCorrente> contasCorrentes = new ArrayList<>();
            for(Map.Entry<Integer , ContaCorrente> contaCorrente : contaCorrenteDBMap.entrySet()){
                contasCorrentes.add(contaCorrente.getValue());
            }
            return contasCorrentes;

        }

        public void addnovaContaCorrente(ContaCorrente contaCorrente){
            contaCorrenteDBMap.put(contaCorrente.getNumeroConta() , contaCorrente);
        }

        public ContaCorrente getContaCorrentePorNumero(int numeroConta){
            return contaCorrenteDBMap.get(numeroConta);
        }

        public double getSomarSaldoContaCorrente() {

            List<ContaCorrente> totalSaldoContasCorrentes = new ArrayList<>();
            double somarSaldoContasCorrentes = 0;
            for (Map.Entry<Integer, ContaCorrente> contaCorrente : contaCorrenteDBMap.entrySet()) {
                somarSaldoContasCorrentes += contaCorrente.getValue().saldo;
            }
            return somarSaldoContasCorrentes;
        }

    public ContaCorrente getContaCorrenteOrigemPorNumero(int numeroContaOrigem){
        return contaCorrenteDBMap.get(numeroContaOrigem);
    }
    public ContaCorrente getContaCorrenteDestinoPorNumero(int numeroContaDestino){
        return contaCorrenteDBMap.get(numeroContaDestino);
    }

}


