package pessoas;

public class Aluno extends Pessoa {
 
    //atributos
    public String Situacao;
    public double Media;

    //metodos
    public void salvarAluno(double media){

        super.salvarPessoa();

        Media = media;
        if (media>=6.0) {
            this.Situacao = "APROVADO";
        }
        else{
            this.Situacao = "REPROVADO";
        }
    }

    public void registrarAluno(){
        super.salvarPessoa();
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
