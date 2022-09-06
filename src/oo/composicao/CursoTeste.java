package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");
        Aluno aluno2 = new Aluno("Thais");
        Aluno aluno3 = new Aluno("Sueli");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Ruby Avançado");
        Curso curso3 = new Curso("FullStack Completo");

        curso1.addAluno(aluno1);

        curso2.addAluno(aluno2);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);


        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso: " + curso1.nome + ". Meu nome é "+ aluno.nome + ".");
        }
        System.out.println();
        for (Aluno aluno: curso2.alunos){
            System.out.println("Estou matriculado no curso: " + curso2.nome + ". Meu nome é "+ aluno.nome + ".");
        }
        System.out.println();
        for (Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso: " + curso3.nome + ". Meu nome é "+ aluno.nome + ".");
        }

        Curso cursoEncontrado = aluno1.getCursoPorNome("Java Completo");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome + ": " + cursoEncontrado.alunos);
        }

        Curso cursoEncontrado1 = aluno2.getCursoPorNome("Ruby Avançado");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado1.nome + ": " + cursoEncontrado1.alunos);
        }

        Curso cursoEncontrado2 = aluno3.getCursoPorNome("FullStack Completo");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado2.nome + ": " + cursoEncontrado2.alunos);
        }
    }
}