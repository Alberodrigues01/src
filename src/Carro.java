public class Carro {

    private Integer quantidadePortas;
    private Integer anoFabricaco;
    private String numeroChassi;
    private String combustivel;
    public String cor;
    public String motor;
    public String acabamento;

    public Carro(Integer quantidadePortas, Integer anoFabricacao, String numeroChassi, String combustivel){
        this.quantidadePortas = quantidadePortas;
        this.anoFabricaco = anoFabricacao;
        this.numeroChassi = numeroChassi;
        this.combustivel = combustivel;
        }

   public String getCor (){
        return cor;
   }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimeValores(){
            System.out.println("Quantidade de Portas => " + quantidadePortas);
            System.out.println("Ano de Fabricacao => " + anoFabricaco);
            System.out.println("Número do Chassi  => " + numeroChassi);
            System.out.println("Combustível       => " + combustivel);
            System.out.println("Cor               => " + getCor());
            System.out.println("Motor             => " + getMotor());
            System.out.println("Acabamento        => " + getAcabamento());
        }

    }
