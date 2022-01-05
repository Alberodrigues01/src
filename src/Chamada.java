
import java.util.ArrayList;
import java.util.Scanner;

public class Chamada {

    public static void main(String [] args) {

    Scanner presenca = new Scanner(System.in);
    Scanner data = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("ANDRÉ");
        alunos.add("BEATRIZ");
        alunos.add("CARLOS");
        alunos.add("DENISE");

        System.out.println("== Aluna(o)s da Turma ==");
        System.out.println(alunos);
        System.out.println("========================");
        System.out.println("Atenção para a chamada!");
        System.out.println("Informe a data: ");
        String dtchamada = data.next();

    for (int i = 0; i < alunos.size(); i++) {
        System.out.print("Aluna(o) => ");
        System.out.println(alunos.get(i) + " está presente? (informe s/n): ");
        String resp = presenca.next();

        if (resp.equals("s")) {
            System.out.println("Presença registrada.");
            System.out.println("");
        } else {
            System.out.println("Falta registrada.");
            System.out.println("");
        }
      }
        System.out.println("=======================");
        System.out.println("Chamada concluída.");
    }

}

