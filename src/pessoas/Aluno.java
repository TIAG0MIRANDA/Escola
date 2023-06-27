package pessoas;

public class Aluno extends Pessoa {
 
    //atributos
    public String Situacao;
    public double Media;

    //metodos
    public void salvarAluno(double media){

        salvarPessoa();

        Media = media;
        if (media>=6.0) {
            Situacao = "APROVADO";
        }
        else{
            Situacao = "REPROVADO";
        }
    }

    public String exibirAluno(){
        return "Média: "+Media+" Situação "+Situacao;
    }

    public String alunosTurmma(String turma){
        
        //variavel
        String alunos;

        //seleção das turmas
        switch (turma) {
            case "301":
                alunos = "\n-Tiago\n-Tigas\n-Pagodinho\n";
                break;
            case "201":
                alunos = "\n-Merlin\n-Eremita\n-PagodinhoXXT\n";
                break;
            case "101":
                alunos = "\n-Aldebaran\n-MU\n-Saga\n";
                break;
        

            default:
                alunos = "sem alunos para selecionar";
                break;
        }
        return alunos;
    }

}
