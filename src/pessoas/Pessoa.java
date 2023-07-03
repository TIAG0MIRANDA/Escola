package pessoas;

public class Pessoa { //class
    
    //atributos
    private String Nome;
    private int Idade;
    private String Email;
    private String Telefone;

    public Pessoa(){
        System.out.println("Olá Senhor ");
    }

    //metodos
    protected void salvarPessoa(){
        this.Nome = "Tiago";
        Idade = 19;
        this.salvarContato("senacrs@gmail.com","(51)9**** ****");
    }
    
    protected void salvarContato(String email, String telefone){
        this.Email = email;
        this.Telefone = telefone;
    }


    //set 
    public void registrar(){
        salvarPessoa();
    }


    //get  
    public String exibirPessoa(){
        return "Nome: "+Nome+" Idade "+Idade+" Email "+Email+" Telefone "+Telefone;
    }

}
