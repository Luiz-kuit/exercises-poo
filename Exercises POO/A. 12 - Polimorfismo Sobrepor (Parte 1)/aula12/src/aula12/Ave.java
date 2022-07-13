package aula12;

public class Ave extends Animal {
    // Atributo adicionai de Ave
    private String corPena;
    // Métodos de Ave
    @Override //Sobrepondo de animal
    public void locomover() {
        System.out.println("Voando");       
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");      
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");       
    }
    // Método Adicional
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
   
  
}