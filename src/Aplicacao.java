
/*
import pessoas.Pessoa;
import pessoas.Aluno;
*/
import curso.Curso;
import escola.Chamada;

public class Aplicacao {
    
    public static void main(String[] args) throws Exception {
        

        // instancia 


        /*
        Pessoa pessoa = new Pessoa();
        pessoa.registrar();
        System.out.println(pessoa.exibirPessoa());
        
        Aluno aluno = new Aluno();
        aluno.salvarAluno(6.5);
        Aluno.registrarAluno();
        System.out.println(Aluno.exibirAluno);


        Chamada chamada = new Chamada("Bom dia Pessoal\n", "301");
        */
        
        Curso curso = new Curso("PHP ", 60, 1400.00);
        System.out.println(curso.exibirCurso());
    }
    
}
