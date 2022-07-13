package aula12;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Aula12 {
    public static void main(String[] args) {
        Ave a1 = new Ave();
        Mamifero m1 = new Mamifero();
        Peixe p1 = new Peixe();
        Reptil r1 = new Reptil();
        // Heranças 
        Canguru c1 = new Canguru();
        Cachorro d1 = new Cachorro();
        Cobra j1 = new Cobra();
        Tartaruga t1 = new Tartaruga();
        GoldFish g1 = new GoldFish();
        Arara f1 = new Arara();

        
        a1.setPeso(0.120f);
        a1.setIdade(3);
        a1.setCorPena("Amarela");
        a1.alimentar();
        a1.locomover();
        a1.emitirSom();

        System.out.println("=============");

        m1.locomover();
        p1.locomover();
        r1.locomover();

        System.out.println("=============");

        c1.locomover();
        c1.usarBolsa();
        System.out.println("=============");
        d1.locomover();
        d1.emitirSom();
        d1.abanarRabo();
        d1.enterrarOsso();
        System.out.println("=============");
        t1.locomover();
        



    }
}
