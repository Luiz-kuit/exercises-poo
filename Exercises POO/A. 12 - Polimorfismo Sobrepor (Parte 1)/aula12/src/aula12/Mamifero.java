package aula12;

public class Mamifero extends Animal {
    // Atributo adicional Mamífero
    private String corPelo;
    // Métodos de Mamífero 
    @Override //Sobrepondo de animal
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    // Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
