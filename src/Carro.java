public class Carro {

    public Integer quantidadePortas;
    public Integer anoFabricacao;
    public String numeroChassi;
    public String combustivel;
    private String cor;
    private double motor;
    private String acabamento;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public String getAcabamento() {
        return acabamento;
    }
    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimeValores(){
     System.out.println("======== CADASTRO DE VEÍCULOS ========");
     System.out.println("Quantidade de Portas => " + quantidadePortas);
     System.out.println("Ano de Fabricação => " + anoFabricacao);
     System.out.println("Número do Chassi  => " + numeroChassi);
     System.out.println("Combustível       => " + combustivel);
     System.out.println("Cor               => " + getCor());
     System.out.println("Motor             => " + getMotor());
     System.out.println("Acabamento        => " + getAcabamento());

    }
}
