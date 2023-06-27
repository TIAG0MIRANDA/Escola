package pessoas;

public class Pessoa { //class
    
    //atributos
    private String Nome;
    private int Idade;
    
    public Pessoa(){
        System.out.println("Olá Senhor ");
    }

    //metodos
    protected void salvarPessoa(){
        Nome = "Tiago";
        Idade = 19;

    }
    //set 
    public void registrar(){
        salvarPessoa();
    }
    //get  
    public String exibirPessoa(){
        return "Nome: "+Nome+" Idade "+Idade;
    }

}
