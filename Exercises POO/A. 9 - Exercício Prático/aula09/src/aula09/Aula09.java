package aula09;

public class Aula09 {
    public static void main(String[] args) {
       Pessoa [] p = new Pessoa[2];
       Livro [] l = new Livro[3];
       
       p[0] = new Pessoa("Thyago", 31, "M");
       p[1] = new Pessoa("Camila", 33, "F");
       
       l[0] = new Livro("Acidez do Ecle", "Ed René", 120, p[0]);
       l[1] = new Livro("Life", "Eduard Smith", 250, p[1]);
       l[2] = new Livro("Good Vibes", "Philip Slow", 200, p[0]);
       
       l[0].abrir();
       l[0].folhear(120);
       l[0].avancarPag();
       System.out.println(l[0].detalhes());
       
       System.out.println("============================");

       l[1].abrir();
       l[1].folhear(200);
       l[1].avancarPag();
       System.out.println(l[1].detalhes());
       
    }
}
