/*
 * Classe criada apenas para reaproveitar algumas funcionalidades gerais
 */
package estudos;

import java.io.IOException;
import java.util.Scanner;

public class Controller {

    public Controller(){}
    
    public Boolean confirmouContinuar(){
        String opcaoUsuario = "n";
        boolean continuar = false;
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Pressione [s] para Continuar\nPressione [n] para Encerrar");
        
            opcaoUsuario = sc.next().toLowerCase();
            
        }catch(Exception e){
            opcaoUsuario = "n";
        }
        
        if( opcaoUsuario.equals("s") ){
            return true;
        }else{
            return false;
        }
    }
    
    public void limparConsole(){
        try{
            String so = System.getProperty("os.name").toLowerCase();

            if( so.contains("windows") ){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                Runtime.getRuntime().exec("clear");
            }
        }catch(Exception e){
            System.out.println("Erro inesperado...");
        }   
    }
    
}
