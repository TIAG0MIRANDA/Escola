//T.M
package curso;

public class Componente { // super classe 
    
    //atributo
    protected String Curso;

    //metodo

    protected String selecionarComponente(String curso){
        this.Curso = curso;
        String retorno;
    
    //validacao
        switch (this.Curso) {
            case "PhP":
                retorno = "\n-Logica\n-Estrutura de repetição\n-Funtions";
                break;
            case "JAVA":
                retorno = "\n-OOP\n-Estrutura de decisao";
                break;
            case "COZINHA":
                retorno = "\n-Panela\n-Copo\nlouça";

            default:
            retorno = "ERRO! ao selecionar curso";
                break;
        }


    //reporno dos componentes
        return retorno;
    }
    
    


}
