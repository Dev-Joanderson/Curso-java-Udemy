package oo.composiçao;

public class CursoTest {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("cla");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java script");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.addCursor(curso3);
        aluno2.addCursor(curso3);
        aluno3.addCursor(curso3);
        
        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso 1 ..."
            + curso1.nome );
            System.out.println("... e o meu nome é "+ aluno.nome);
            System.out.println();

        }
        System.out.println(aluno1.cursos.get(0).alunos);

       Curso cursoEncontrado = aluno1.obterCursoPorNome("Web 2023");

       if(cursoEncontrado != null) {
           System.out.println(cursoEncontrado.nome);
           System.out.println(cursoEncontrado.alunos);
       }
    }
    
}
