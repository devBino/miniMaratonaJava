package estudos;

import java.util.Scanner;

public class TesteArray extends Controller {

    public TesteArray(){}
    
    public void arrayUniDimensional(){
        //criação tradicional
        System.out.println("SUPER HEROES");
        
        String[] heroes = new String[6];
        heroes[0] = "Homem de Ferro";
        heroes[1] = "Thor";
        heroes[2] = "Hulk";
        heroes[3] = "Viuva Negra";
        heroes[4] = "Gavião Arqueiro";
        heroes[5] = "Capitão América";
        
        for( String her : heroes ){
            System.out.println(her);
        }
        
        System.out.println("______________________________________________________________________");
        
        //criação dinâmica
        System.out.println("TECNOLOGIAS");
        
        String[] tecs = new String[]{"JAVA","ANGULAR","PHP","NODEJS","MYSQL","PYTHON","C#"};
        
        for( String tec : tecs ){
            System.out.println(tec);
        }
    }
    
    public Boolean arrayMultiDimensional(boolean executar){
        
        if( !executar ){
            return false;
        }
        
        try{
            //arrays e variaveis necessárias para o processamento
            String[] setores = new String[]{"BANCARIO","ELETRICO","OUTROS"};
            String[][] ativosBolsa = new String[3][3];
            
            int totalSetores = setores.length;
            int totalAcoesPorSetor = ativosBolsa[0].length;
            
            Scanner sc = new Scanner(System.in);
            
            //recolhe dados do usuário e preenche o array multidimensional ativosBolsa
            for( int i=0; i<totalSetores; i++ ){
                
                System.out.println("Informe os códigos de Ações para o setor "+setores[i]);
                System.out.println("------------------------------------------------------------");
                
                for( int j=0; j<totalAcoesPorSetor; j++ ){
                    
                    System.out.println("Informe a " + (j+1) + "ª Ação do setor "+setores[i]);
                    String codigoAtivo = sc.next();
                    
                    ativosBolsa[i][j] = codigoAtivo;
                }
            }
            
            this.limparConsole();
            System.out.println("AS AÇÕES INFORMADAS FORAM:");
            
            //saida de dados
            for( int i=0; i<totalSetores; i++ ){
                
                System.out.println("\tSETOR: "+setores[i]);
                
                for( int j=0; j<totalAcoesPorSetor; j++ ){
                    System.out.println( "\t\t\t" + (j+1) + "ª Ação: " + ativosBolsa[i][j] );
                }
                
                System.out.println("\t____________________________________________");
            }
            
            //verifica se o usuário que continuar
            if( this.confirmouContinuar() ){
                arrayMultiDimensional(true);
            }
            
            
        }catch(Exception e){
            System.out.println("Erro inesperado...");
            this.limparConsole();
            
            arrayMultiDimensional(true);
        }
        
        return true;
    }
    
}