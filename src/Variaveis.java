public class Variaveis {

// Exercicio 5_modo 1_utilizando o método valueOf (tipo primitivo para tipo Wrapper).

    public static void main(String[] args) {

        int variavel1 = 10;
        Integer variavel2 = Integer.valueOf(variavel1);

        System.out.println(variavel2);
        System.out.println(variavel1 == variavel2);
        System.out.println(variavel1 != variavel2);



    }
}