package escola; //Pacote

import pessoas.Aluno;
import curso.Curso;

public class Chamada { // class

    //atributo
    public String Turma;
    public String Curso;

    //construtor
    public Chamada(String mensagem, String turma){

        //escrever mensagem de boas vindas
        String texto = "olá turma "+turma+" "+mensagem;
        System.out.print(texto);

        //atribuir valor
        this.Turma = turma;

        //metodo
        this.selecionarTurma();
        this.selecionarAlunos();
    
        Curso curso = new Curso (this.Curso, 60, 1200.0);
        System.out.println(curso.exibirCurso());
    }

    public void selecionarTurma(){
        String texto = "Turma "+this.Turma+" selecionada \n";
        System.out.println(texto);
        switch (this.Turma) {
            case "101":
                this.Curso = "PhP";
                break;
            case "102":
                this.Curso = "JAVA";
                break;
            case "103":
                this.Curso = "COZINHA";
                break;
        
            default:
                this.Curso = " ";
                break;
        }
    }

    private void selecionarAlunos(){

        Aluno aluno = new Aluno();
        System.out.println(aluno.alunosTurmma(this.Turma));
         
    }

}