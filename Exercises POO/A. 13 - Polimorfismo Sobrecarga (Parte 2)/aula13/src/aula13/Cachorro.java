package aula13;

public class Cachorro extends Lobo {
    // Método de Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    // Método de Sobrecarga
    public void reagir(String frase) { 
        if (frase.equals("Toma Comida") || frase.equals("Olá")) {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min) { // Incluindo assinaturas e tipo de parâmetros diferentes
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {  
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }
    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }

    }
    public void reagir(int idade, float peso) {
        if (idade < 5)
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }    
    }
}
