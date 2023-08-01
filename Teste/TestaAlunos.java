package Teste;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Luca Pinhiro");
        alunos.add("Giulia Pasi");
        alunos.add("Diego Pinheiro");

        boolean Luca = alunos.contains("Luca");
        System.out.println(Luca);

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);


    }
}
