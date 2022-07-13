package aula12;

public class Cachorro extends Mamifero {
    // Métodos de Cachorro
    public void enterrarOsso() {
        System.out.println("Osso Enterrado");    
    }
    public void abanarRabo() {
        System.out.println("Abanando Rabo");    
    }
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au");
    }
}
