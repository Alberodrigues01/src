import java.util.ArrayList;

public class Chamada {

    public static void main(String[] args){

        System.out.println("=== DIÁRIO DE CLASSE: Controle de Chamadas ===");

        String[] data = new String[3];
        data[0] = "04/01/2022";
        data[1] = "05/01/2022";
        data[2] = "06/01/2022";

        for (int i = 0; i < data.length; i++);

        String[] aluno = new String[3];
        aluno[0] = "André";
        aluno[1] = "Beatriz";
        aluno[2] = "Carlos";

        for (int j = 0; j < aluno.length; j++);

        String[][] chamada = new String[3][3];
        chamada[0][0] = "presente";
        chamada[0][1] = "ausente";
        chamada[0][2] = "presente";
        chamada[1][0] = "ausente";
        chamada[1][1] = "ausente";
        chamada[1][2] = "presente";
        chamada[2][0] = "presente";
        chamada[2][1] = "presente";
        chamada[2][2] = "ausente";

        for (int i = 0; i < chamada.length; i++) {
            for (int j = 0; j < chamada[i].length; ++j) {

                System.out.println(data[i] + "-" + aluno[j] + "-" + chamada[i][j] + "");
            }
            System.out.println("");
        }
    }
}




