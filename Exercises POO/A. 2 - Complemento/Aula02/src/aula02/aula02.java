package aula02;

public class aula02 {
    public static void main(String[] args) {
        carro c1 = new carro();

        c1.modelo = "Gol";
        c1.anoModelo = 2020;
        c1.cor = "Preto";
        c1.combustivel = "Flex";
        
        c1.desligado = true;

        c1.status();
        c1.dirigir();
  

    }
}
