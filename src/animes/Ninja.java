package animes;

import controllers.Controller;

public class Ninja extends Controller{
    
    private String nome;
    private String aldeia;
    private String ninJutso;
    private String ginJutso;
    private String sensei;
    private String adjetivo;
    
    public Ninja( String nome, String aldeia, String ninJutso, String ginJutso, String sensei, String adjetivo ){
        this.nome = nome;
        this.aldeia = aldeia;
        this.ninJutso = ninJutso;
        this.ginJutso = ginJutso;
        this.sensei = sensei;
        this.adjetivo = adjetivo;
    }
 
    public String getNome(){
        return this.nome;
    }
    public String getAldeia(){
        return this.aldeia;
    }
    public String getNinJutso(){
        return this.ninJutso;
    }
    public String getGinJutso(){
        return this.ginJutso;
    }
    public String getSensei(){
        return this.sensei;
    }
    public String getAdjetivo(){
        return this.adjetivo;
    }
}