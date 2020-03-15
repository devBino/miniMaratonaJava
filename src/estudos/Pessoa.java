package estudos;

public class Pessoa extends Controller {

    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa( String nome, String endereco, String telefone ){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    
    public void setNome(String nome){
         this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getDados(){
        String returnParam = "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: "+ this.telefone;
        return returnParam;
    }
    
}
