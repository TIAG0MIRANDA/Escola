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


}
