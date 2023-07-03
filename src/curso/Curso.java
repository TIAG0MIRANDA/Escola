//T.M
package curso; //super classe 
public class Curso extends Componente {
    
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
        return "Nome do curso "+this.NomeCurso+"Cargahoraria "+this.CargaHoraria+"valor "+this.Valor;
        System.out.println(curso.exibirCurso());
    }


}
