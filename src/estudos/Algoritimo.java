package estudos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Algoritimo extends Controller{

    public Algoritimo(){}
    
    @Override
    public Boolean confirmouContinuar(){
        
        Scanner sc = new Scanner(System.in);
        String opcaoUsuario = "n";
        
        try{
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Deseja repetir o comando? [s] ou [n]");
            opcaoUsuario = sc.next();    
        }catch(Exception e){
            opcaoUsuario = "n";
        }
        
        if( opcaoUsuario.toLowerCase().equals("s") ){
            return true;
        }else{
            return false;
        }
    }
    
    public void lesmaAlpinista(){
        String strEnunciado = "Uma lesma precisa subir um poste de 10 metros de altura.";
        strEnunciado = strEnunciado + "\nDurante o dia a lesma sobe 2 metros, durante a noite ela escorrega 1.";
        strEnunciado = strEnunciado + "\nQuantos dias a lesma levara para subir ao topo do poste?";
        
        System.out.println(strEnunciado);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para ver a resposta ou 0 para encerrar ");
        
        int opcaoUsuario = sc.nextInt();
        
        if( opcaoUsuario == 1 ){
            respostaLesmaAlpinista();
        }
    }
    
    public void respostaLesmaAlpinista(){
        
        //entrada de dados
        String strProgresso = "";
        int limiteLoop      = 20;
        int alturaPoste     = 10;
        int subidaLesma  = 0;
        int cont = 0;
        int diaParada = 0;   
        int progressoAtual = 0;
        int progressoAnterior = 0;
        
        //processamento
        while( subidaLesma < alturaPoste ){
            
            progressoAnterior = subidaLesma;
            
            if(alturaPoste < subidaLesma + 2){
                subidaLesma += 1;
            }else{
                subidaLesma += 2;    
            }
            
            subidaLesma -= 1;
            
            progressoAtual = subidaLesma;
            
            if( progressoAtual - progressoAnterior == 0 && diaParada == 0 ){
                diaParada = cont;
            }
            
            strProgresso = strProgresso + "\n" + (cont + 1) + "º Dia a lesma subiu " + subidaLesma + " Metro(s)";
            
            if(cont == limiteLoop){
                break;
            }
            
            cont += 1;
        }
        
        if( diaParada > 0 ){
            strProgresso = strProgresso + "\nA pobre lesma encalhou no dia " + diaParada + ". Então ela nunca irá subir ao topo do poste";    
        }else{
            strProgresso = strProgresso + "\nA lesma subirá o topo do poste no dia " + (cont + 1);
        }
        
        //saida de dados
        System.out.println(strProgresso);
       
    }
    
    public void calculaJurosCompostos( boolean exec ){
        
        /*
            Fórmula para cálculo de juros compostos
            M = C.(1+i)t
        */
    
        try{
            //entrada de dados
            Scanner sc = new Scanner(System.in);

            System.out.println("Quanto deseja investir?");
            double capitalInicial = sc.nextDouble();
            
            System.out.println("Quantos anos vai deixar render?");
            int tempo = sc.nextInt();
            
            System.out.println("Qual a taxa?");
            double taxa = sc.nextDouble();

            //processamento de dados
            double preTaxa = 1 + (taxa / 100);
            double expPreTaxa = Math.pow(preTaxa,tempo);
            double montanteFinal = expPreTaxa * capitalInicial;

            DecimalFormat df = new DecimalFormat("#,###.00");
            String fmtMontante = df.format(montanteFinal);
            String fmtCapitalInicial = df.format(capitalInicial);
            String fmtTaxa = df.format(taxa);

            this.limparConsole();
            
            //saida de dados
            System.out.println("Valor Investido: R$ "+fmtCapitalInicial);
            System.out.println("Tempo em Anos: "+tempo);
            System.out.println("Taxa ao Ano: " + fmtTaxa);
            System.out.println("Valor Retorno Bruto: " + fmtMontante);
            
            //confirma se usuario quer continuar
            if( this.confirmouContinuar() ){
                repeteCalculoJuros();
            }
            
        }catch(Exception e){
            //caso o usuário digite algo errado, limpa o console e chama a função novamente
            System.out.println("Por favor tente novamente!!\nEXEMPLO:\nValor a Investir: 1200,00\nTempo em Anos 10, sem virgula ou ponto\nTaxa: 5,45");
            repeteCalculoJuros();
        }
    }
    
    public void repeteCalculoJuros(){
        this.limparConsole();
        calculaJurosCompostos(true);
    }
    
}
