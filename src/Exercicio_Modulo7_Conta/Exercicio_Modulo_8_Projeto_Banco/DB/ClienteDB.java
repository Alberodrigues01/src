package src.Exercicio_Modulo_8_Projeto_Banco.DB;

import src.Exercicio_Modulo_8_Projeto_Banco.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDB {

    private List<Cliente> clienteList = new ArrayList<>();

    public List<Cliente>getClienteList (){
        return clienteList;
    }

    public void addnovoCliente(Cliente cliente){
        int numCliente = (clienteList.size()+1);
        String nomeCliente;
        cliente.setNumCliente(numCliente);
        clienteList.add(cliente);
    }
}

