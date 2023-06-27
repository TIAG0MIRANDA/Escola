package escola; //Pacote

import pessoas.Aluno;
public class Chamada { // class

    //atributo
    public String Turma;


    //construtor
    public Chamada(String mensagem, String turma){

        //escrever mensagem de boas vindas
        String texto = "olá turma "+turma+" "+mensagem;
        System.out.print(texto);

        //atribuir valor
        Turma = turma;

        //metodo
        selecionarTurma();
        selecionarAlunos();
    }

    public void selecionarTurma(){
        String texto = "Turma "+Turma+" selecionada \n";
        System.out.println(texto);
    }

    private void selecionarAlunos(){

        Aluno aluno = new Aluno();
        System.out.println(aluno.alunosTurmma(Turma));
         
    }


}