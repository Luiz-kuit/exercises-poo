package aula10;

public class Pessoa {
    // Atributos 
    private String nome; 
    private int idade;
    private String sexo;
    // Métodos Públicos
    public void fazerAniv(){
        this.idade++; // Adicionando + um ano na idade
    }
    // Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String apresentar() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
        
    
}