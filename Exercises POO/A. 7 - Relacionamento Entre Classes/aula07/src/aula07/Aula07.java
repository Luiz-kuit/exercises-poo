package aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Thyago", "Brazil", "Masculino", 30, 1.83f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Rodrigo", "EUA", "Masculino", 33, 1.90f, 70.1f, 14, 2, 3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();


        
    }
}
