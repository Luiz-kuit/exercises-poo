package aula02;

public class carro {
    public String modelo;
    public float anoModelo;
    protected String cor;
    protected String combustivel;
    public boolean desligado;

    public void status(){
        System.out.println("Modelo: "  + this.modelo);
        System.out.println("Ano Modelo: " + this.anoModelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Combustivel " + this.combustivel);
        System.out.println("Está Desligado: " + this.desligado);
    }
    
    public void dirigir(){
        if (this.desligado == true) {
            System.out.println("ERRO! Não pode dirigir");
        }
        else
        {
            System.out.println("Pode dirigir");
        }
    }

    public void desligado(){
        this.desligado = true;
    }

    public void ligado(){
        this.desligado = false;
    }
}
