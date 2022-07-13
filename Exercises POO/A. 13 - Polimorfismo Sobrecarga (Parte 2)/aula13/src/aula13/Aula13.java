package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Olá"); //Abanar ou latir
        c.reagir(11, 45); // Abanar
        c.reagir(19, 00); // Rosnar
        c.reagir(false); // Rosnar e latir
        c.reagir(2, 12.5f); // Latir
        c.reagir(17, 4.5f); // Rosnar
        
    }
    
}
// Classe "Cachorro" exemplifica o método de sobrecarga