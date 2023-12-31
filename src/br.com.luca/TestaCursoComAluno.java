public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Luca Pinheiro Gomes", 231103);
        Aluno a3 = new Aluno("Diego Pinheiro", 17645);
        Aluno a4 = new Aluno("Jilmar Richarlison", 224532);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a.getNome());
        });

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a4));

        
        Aluno turini = new Aluno("Rodrigo Turini", 34567);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(a1.equals(turini));

        // Obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == turini.hashCode());



    }
}
