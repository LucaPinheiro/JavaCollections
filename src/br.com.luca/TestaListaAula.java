
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        // Ordenando a lista de aulas pelo título
        aulas.sort((aula1, aula2) -> aula1.getTitulo().compareTo(aula2.getTitulo()));
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
