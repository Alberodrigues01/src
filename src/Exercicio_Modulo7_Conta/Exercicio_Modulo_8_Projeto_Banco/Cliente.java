package src.Exercicio_Modulo_8_Projeto_Banco;

public class Cliente {

    public int numCliente;
    public String nomeCliente;

    public Cliente(String nomeCliente){
        this.numCliente = numCliente;
        this.nomeCliente = nomeCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numCliente=" + numCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}

