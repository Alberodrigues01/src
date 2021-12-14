import java.util.Scanner;

public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String MIL = "Mil";
    public static final String ESPORTIVO = "Esportivo";
    private Integer quantidadePortas;
    private String numeroChassi;
    private Integer anoFabricacao;
    private String combustivel;
    private String cor;
    private String motor;
    private String acabamento;


    public Integer getQuantidadePortas(){
        return quantidadePortas = 4;
    }
    public void setQuantidadePortas(Integer quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroChassi() {
        return numeroChassi = "9BG116GW04C400001";}
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao = 2020;}
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getCombustivel() {return combustivel = "FLEX"; }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
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
     System.out.println(" ======== CADASTRO DE VEÍCULOS ========");
     System.out.println("Quantidade de Portas => " + getQuantidadePortas());
     System.out.println("Número do Chassi => " + getNumeroChassi());
     System.out.println("Ano de Fabricação  => " + getAnoFabricacao());
     System.out.println("Tipo de Combustível => " + getCombustivel());
     System.out.println("Cor => " + getCor());
     System.out.println("Motor => " + getMotor());
     System.out.println("Acabamento => " +getAcabamento());



    }
}
