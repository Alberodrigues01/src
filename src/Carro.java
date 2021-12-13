import java.util.Scanner;

public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String MIL = "Mil";
    public static final String ESPORTIVO = "Esportivo";
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusoPneu;
    private String cor;
    private String motor;
    private String acabamento;
    private Integer quantidadeFreios;
    private Integer quantidadeAmortecedores;

    public Integer getQuantidadePneus(){
        return quantidadePneus = 4;
    }
    public void setQuantidadePneus(Integer quantidadePneus){
        this.quantidadePneus = quantidadePneus;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadePneus;
    }
    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusoPneu() {
        return quantidadePneus * 4;
    }
    public void setQuantidadeParafusoPneu(Integer quantidadeParafusoPneu) {
        this.quantidadeParafusoPneu = quantidadeParafusoPneu;
    }
    public Integer getQuantidadeAmortecedores() {return quantidadePneus; }
    public void setQuantidadeAmortecedores(Integer quantidadeAmortecedores) {
        this.quantidadeAmortecedores = quantidadeAmortecedores;
    }
    public Integer getQuantidadeFreios() {return quantidadePneus * 2;}
    public void setQuantidadeFreios(Integer quantidadeFreios) {
        this.quantidadeFreios = quantidadeFreios;
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
     System.out.println(" ======== ORDEM DE PRODUÇÃO ========");
     System.out.println("Quantidade Pneus => " + getQuantidadePneus());
     System.out.println("Quantidade de Calotas => " + getQuantidadeCalotas());
     System.out.println("Quantidade de Parafusos dos Pneus => " + getQuantidadeParafusoPneu());
     System.out.println("Quantidade de Amortecedores => " + getQuantidadeAmortecedores());
     System.out.println("Quantidade de Freios => " + getQuantidadeFreios() + " (Freios Duplos)");
     System.out.println("Cor => " + getCor());
     System.out.println("Motor => " + getMotor());
     System.out.println("Acabamento => " +getAcabamento());



    }
}
