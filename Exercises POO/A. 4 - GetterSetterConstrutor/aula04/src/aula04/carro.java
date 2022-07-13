// Criação: construtor, getters e setters. Obs: Utilizando o comando "Source Action" 

package aula04;

public class carro {
    private String modelo;
    private float anoModelo;
    private String cor;
    private boolean desligado;
    
    public carro(String modelo, float anoModelo, String cor, boolean desligado) {
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.desligado = desligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(float anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

  
}
