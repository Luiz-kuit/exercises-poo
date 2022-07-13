package aula02;

public class aula02 {
    public static void main(String[] args) {
    //Instanciando o código da classe caneta
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
            
        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compact";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.carga = 90;

        c2.tampar();
        c2.status();
        c2.rabiscar();

    }
}
