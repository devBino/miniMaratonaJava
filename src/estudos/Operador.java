package estudos;

import controllers.Controller;

public class Operador extends Controller {

    public Operador(){
        System.out.println("A classe Operador foi instanciada...");
    }
    
    public void calculo(Integer n1, Integer n2, Integer tipo){
        String strTipo = "";
        int result = 0;
        
        switch(tipo){
            case 1:
                strTipo = "+";
                result = n1 + n2;
                break;
            case 2:
                strTipo = "-";
                result = n1 - n2;
                break;
            case 3:
                strTipo = "X";
                result = n1 * n2;
                break;
            case 4:
                strTipo = "/";
                result = n1 / n2;
                break;
            case 5:
                strTipo = "%";
                result = n1 % n2;
                break;
            default:
                strTipo = "+";
                result = n1 + n2;
                break;
        }
        
        System.out.println(n1 + " " + strTipo + " " + n2 + " = " + result );
        
    }
    
    public void comparaNomesPessoas( String[] nomes ){
        if( nomes[0].equals(nomes[1]) ){
            System.out.println("As duas pessoas tem o mesmo nome, porque o nome " + nomes[0] + " é igual a " + nomes[1]);
        }else{
            System.out.println("As duas pessoas tem nomes diferentes porque " + nomes[0] + " é diferente de " + nomes[1] );
        }
    }
    
}
