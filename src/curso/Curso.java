//T.M
package curso; //super classe 
public class Curso extends Componente { 
        // sub class
    // atributos
    protected String NomeCurso;
    protected int CargaHoraria;
    protected double Valor;

    public Curso (String nome, int carga, double valor){
        
        this.salvarCurso(nome, carga, valor);
    }

    //metodos 
    private void salvarCurso(String nome, int carga, double valor){
        this.NomeCurso = nome;
        this.CargaHoraria = carga;
        this.Valor = valor;

    }

    //get
    public String exibirCurso(){
        
        return "\nNome do curso: "+this.NomeCurso+"\nCargahoraria: "+this.CargaHoraria+"\nValor: "+this.Valor+"\nCurso"+super.selecionarComponente(this.Curso);
    }


}
