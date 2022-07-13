package aula12;

public class Peixe extends Animal {
    // Atributo adicionai de Peixe
    private String corEscama;
    // Métodos de Peixe
    @Override //Sobrepondo de animal
    public void locomover() {
        System.out.println("Nadando");    
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");  
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");    
    }
    // Método adicional
    public void soltarBolha() {
        System.out.println("Soutou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    


}
