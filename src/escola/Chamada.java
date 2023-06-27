package escola; //Pacote

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
    }

    public void selecionarTurma(){
        String texto = "Turma "+Turma+" selecionada \n";
        System.out.println(texto);
    }

    private void selecionarAlunos(){
        
    }


}