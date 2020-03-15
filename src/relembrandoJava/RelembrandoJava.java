package relembrandoJava;

/**
 * Estamos importanto todas as classes
 * do pacote estudos, porque são poucas, mas
 * por convenção devemos importar classe a classe
*/

import java.util.Scanner;
import estudos.*;

public class RelembrandoJava {

    public static void main(String[] args) {
        
        String msgInicial = "OI, ESSE PROGRAMA RESULTA DE UMA MINI MARATONA EM JAVA.";
        msgInicial = msgInicial + " \n:) :) :) :) :) ";
        
        apresentacao(msgInicial,0);
        
    }
    
    public static void apresentacao(String msgInicial,int cont){
        
        try{
            Controller ct = new Controller();
            int max = msgInicial.length();
            String letra = Character.toString(msgInicial.charAt(cont));
            System.out.print(letra);

            cont += 1;

            if( !letra.isEmpty() ){
                Thread.sleep(250);   
            }
            
            if( cont < max ){
                apresentacao(msgInicial, cont);
            }else{
                ct.limparConsole();
                escolherComando(true);
            }
            
        }catch(Exception e){
            System.out.println("Erro inesperado...");
        }
        
    }
    
    public static void escreveMenu(){
        String[] listaComandos = new String[]{
            "EXEMPLO ANIMAL",
            "EXEMPLO PESSOA",
            "OPERADORES",
            "ALGORÍTIMO DA LESMA",
            "ALGORÍTIMO JUROS COMPOSTOS",
            "EXEMPLO ARRAY UNI-DIMENSIONAL",
            "EXEMPLO ARRAY MULTI-DIMENSIONAL",
            "EXEMPLO COM LIST<>"
        };

        titulo("PARA INICIAR O PROGRAMA, ESCOLHA UM COMANDO PARA TESTAR:","+");

        for(int i=0; i<listaComandos.length; i++){
            System.out.println("[" + (i + 1) + "]" + listaComandos[i]);
        }
    }
    
    public static void direcionaComando(String opcaoUsuario){
        
        int tempo = 5000;
                
        switch( opcaoUsuario ){
            case "1":
                exemploAnimal();
                break;
            case "2":
                exemploPessoa();
                break;  
            case "3":
                exemploOperador();
                tempo = 12000;
                break;
            case "4":
                exemploLesmaAlpinista();
                tempo = 30000;
                break;
            case "5":
                exemploJurosCompostos();
                tempo = 5000;
                break;  
            case "6":
                exemploArrayUniDimensional();
                tempo = 15000;
                break;
            case "7":
                exemploArrayMultiDimensional();
                tempo = 30000;
                break;
            case "8":
                exemploArrayList();
                tempo = 30000;
                break;
            default:
                break;
        }
        
        System.out.print("\n");
                
        temporizador(tempo, ".");
        
        Controller ct = new Controller();
        ct.limparConsole();

        if( ct.confirmouContinuar() ){
            escolherComando(true);
        }
    }
    
    public static void escolherComando(boolean continuar){
        try{
            if( continuar ){
                
                Scanner sc = new Scanner(System.in);
                
                escreveMenu();
                
                separaComandosFraco();
                
                System.out.println("Digite o número do comando:");
                String opcaoUsuario = sc.next();
                
                direcionaComando(opcaoUsuario);
                
            }
            
        }catch(Exception e){
            System.out.println("Ocorreu um erro inesperado...");
        }
    }
    
    public static void temporizador(int tempo, String sinal){
        try{
            System.out.print(sinal);
        
            Thread.sleep(1000);
            
            tempo -= 1000;
            
            if(tempo > 1000){
                temporizador(tempo, sinal);
            }
        }catch(Exception e){
            System.out.println("Erro inesperado...");
        }
    }
    
    public static void separaComandosForte(){
        System.out.println("======================================================================================");
    }
    
    public static void separaComandosFraco(){
        System.out.println("----------------------------------------------------");
    }
    
    public static void titulo(String param, String sinal){
        
        marcarBorda(param,sinal);
        System.out.println(param);
        marcarBorda(param, sinal);
        
    }
    
    public static void marcarBorda(String param, String sinal){
        for( int i=0; i<param.length(); i++ ){
            System.out.print(sinal);
        }
        System.out.print("\n");
    }
    
    public static void exemploAnimal(){
        
        //Exemplo de uso de classe em outro pacote
        titulo("DADOS DO GATO CHAMADO POKA:","*");
        
        Animal poka = new Animal("Poka",3);
        String dadosPoka = poka.getDados();
        System.out.println(dadosPoka);
        
        separaComandosForte();
        
    }
    
    public static void exemploPessoa(){
        
        titulo("DADOS DE UMA PESSOA:", "*");
        
        Pessoa p = new Pessoa("Fernando Bino Machado","4197460578","Rua Das Rosas, 542 - Florestal");
        String dadosP = p.getDados();
        System.out.println(dadosP);
        
        separaComandosForte();
        
    }
    
    public static void exemploOperador(){
        
        titulo("EXEMPLOS COM ALGUNS OPERADORES:","*");
        
        //Exemplos com operadores
        Operador o = new Operador();
        
        o.calculo(10, 5, 1);
        o.calculo(10,5,2);
        o.calculo(10,5,3);
        o.calculo(10,5,4);
        o.calculo(10,5,5);
        o.calculo(10,5,6);
        
        separaComandosForte();
        
        titulo("COMPARANDO NOMES: ","*");
      
        o.comparaNomesPessoas(new String[]{"Luiz","Fernando"});
        separaComandosForte();
        
    }
    
    public static void exemploLesmaAlpinista(){
        
        titulo("EXEMPLO DE ALGORÍTIMO DA LESMA","*");
        
        separaComandosFraco();
        
        Algoritimo a = new Algoritimo();
        a.lesmaAlpinista();
        
        separaComandosForte();
        
    }
    
    public static void exemploJurosCompostos(){
        
        titulo("EXEMPLO DE CALCULO DE JUROS COMPOSTOS: ","*");
        
        Algoritimo a = new Algoritimo();
        a.calculaJurosCompostos( true );
        
        separaComandosForte();
        
    }
    
    public static void exemploArrayUniDimensional(){
        
        titulo("EXEMPLO DE ARRAY SIMPLES: ","*");
        
        TesteArray t = new TesteArray();
        t.arrayUniDimensional();
        
        separaComandosForte();
        
    }
    
    public static void exemploArrayMultiDimensional(){
        
        titulo("EXEMPLO DE ARRAY MULTI DIMENSIONAL (matriz): ","*");
        
        TesteArray t = new TesteArray();
        t.arrayMultiDimensional(true);
        
        separaComandosForte();
        
    }
    
    public static void exemploArrayList(){
        
        titulo("EXEMPLO DE ARRAY LIST<>","*");
        
        TesteArray t = new TesteArray();
        t.exemploArrayList(true);
        
        separaComandosForte();
        
    }
    
}
