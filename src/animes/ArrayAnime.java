package animes;

public class ArrayAnime {
    
    public ArrayAnime(){}
    
    public void exemploArrayObjetoAnimeNaruto(){
        
        Ninja[] njs = new Ninja[3];
        //String nome, String aldeia, String ninJutso, String ginJutso, String sensei, String adjetivo
        njs[0] = new Ninja("Neji","Folha","Punho Suave; Bea Ku Gan","Não visto ainda","Gay","Liderança");
        njs[1] = new Ninja("Rock Lee","Folha","Não Tem","Não Tem","Gay","Esforço");
        njs[2] = new Ninja("Gaara","Areia","Enterro de Areia;Tisunami de Areia, Tempestade de Areia; Defesa suprema","Não visto ainda","Desconhecido","Liderança");
        
        System.out.println("LISTA DE NINJAS: \n===========================================================");
        
        for( Ninja nj : njs ){
            System.out.println("\tNinja: " + nj.getNome());
            System.out.println("\tAldeia: " + nj.getAldeia());
            System.out.println("\tNin Jutso: " + nj.getNinJutso());
            System.out.println("\tGin Jutso: " + nj.getGinJutso());
            System.out.println("\tSensei: " + nj.getSensei());
            System.out.println("\tAdjetivo: " +nj.getAdjetivo());
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
