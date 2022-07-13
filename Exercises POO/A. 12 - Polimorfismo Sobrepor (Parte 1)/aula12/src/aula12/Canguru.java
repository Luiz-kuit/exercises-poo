package aula12;

public class Canguru extends Mamifero {
    // Métodos de Canguru
    public void usarBolsa() {
        System.out.println("Usando Bolsa");
    }
   @Override 
    public void locomover() {
        System.out.println("Saltando");   
    }
}
