package estudos;

import controllers.Controller;

public class Animal extends Controller {

    private String nome;
    private Integer idade;
    
    public Animal( String paramNome, Integer paramIdade ){
        this.setNome(paramNome);
        this.setIdade(paramIdade);
    }
    
    public void setNome(String paramNome){
        this.nome = paramNome;
    }
    public void setIdade(Integer paramIdade){
        this.idade = paramIdade;
    }
    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    
    public String getDados(){
        String paramReturn = "Nome: " + this.nome + " Idade: " + this.idade;
        return paramReturn;
    }
    
}
