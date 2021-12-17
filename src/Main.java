public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro(4,2020,"9BG116GW04C40001",
                "FLEX");
        carro.setCor("Vermelho");
        carro.setMotor("1.4");
        carro.setAcabamento("GLX");

        carro.imprimeValores();

    }
}
