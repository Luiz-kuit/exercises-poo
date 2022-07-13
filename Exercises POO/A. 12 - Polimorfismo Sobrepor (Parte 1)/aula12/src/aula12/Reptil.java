package aula12;

public class Reptil extends Animal {
    // Atributo adicional de Réptil
    private String corEscama;
    // Métodos de Réptil 
    @Override //Sobrepondo de animal
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    // Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
   
}
