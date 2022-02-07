package src.Exercicio_Modulo_8_Projeto_Banco.DB;

import src.Exercicio_Modulo_8_Projeto_Banco.ContaSalario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaSalarioDB {

    private Map<Integer, ContaSalario> contaSalarioDBMap = new HashMap<>();

    public Map <Integer , ContaSalario >getContaSalarioDBMap (){
        return contaSalarioDBMap;
    }

    public List<ContaSalario> getcontaSalario(){
        List <ContaSalario> contasSalarios = new ArrayList<>();
        for(Map.Entry<Integer , ContaSalario> contaSalario : contaSalarioDBMap.entrySet()){
            contasSalarios.add(contaSalario.getValue());
        }
        return contasSalarios;

    }

    public void addnovaContaSalario(ContaSalario contaSalario){
        contaSalarioDBMap.put(contaSalario.getNumeroConta() , contaSalario);
    }

    public ContaSalario getContaSalarioPorNumero(int numeroConta){
        return contaSalarioDBMap.get(numeroConta);
    }

    public double getSomarSaldoContaSalario() {

        List<ContaSalario> totalSaldoContasSalarios = new ArrayList<>();
        double somarSaldoContasSalarios = 0;
        for (Map.Entry<Integer, ContaSalario> contaSalario : contaSalarioDBMap.entrySet()) {
            somarSaldoContasSalarios += contaSalario.getValue().saldo;
        }
        return somarSaldoContasSalarios;
    }
    public ContaSalario getContaSalarioDestinoPorNumero(int numeroContaDestino){
        return contaSalarioDBMap.get(numeroContaDestino);
    }
}
