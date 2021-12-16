
public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.quantidadePortas = 4;
        carro.anoFabricacao = 2020;
        carro.numeroChassi = "9BG116GW04C400001";
        carro.combustivel = "FLEX";
        carro.setCor("Vermelho");
        carro.setMotor(1.4);
        carro.setAcabamento("GLX");
        carro.imprimeValores();
    }
}
