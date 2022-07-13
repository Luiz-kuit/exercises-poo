/* Regras da luta: 
 * 1 - Só pode ser marcada entre lutadores da mesma categoria;
 * 2 - Desafiado e desafiante devem ser lutadores diferentes;
 * 3 - Só pode acontecer se estiver aprovada;
 * 4 - Só pode ter como resultado a vitória ou o empate;
 * Adicional: 
 * 1 - Acrescentar atributo "sexo" e só pode ter lutadores do mesmo sexo.
 */

package aula07;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado; // Utilizando o tipo abstrato de dados, trazendo a instância da classe "Lutador" e criando uma relação.
    private Lutador desafiante; // Agregação: O desafiado tem um atributo da classe lutador.  
    private int rounds;
    private boolean aprovada;
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() // Colocando lutadores da mesma categoria 
                && l1.getSexo() == l2.getSexo() // Colocando lutadores do mesmo sexo
                && l1 != l2) { // Colocando lutadores diferentes 
            this.aprovada = true; // Aprovando a luta
            this.desafiado = l1; // Incluindo o lutador 1
            this.desafiante = l2; // Incluindo o lutador 2
        } else {
            this.aprovada = false; // Luta não pode ser aprovada
            this.desafiado = null; // Consequetemente não haverá desafiado nem desafiante
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.aprovada) { // Trazendo a aprovação da luta 
            System.out.println("Desafiado");
            this.desafiado.apresentar(); // Apresentando o desafiado
            System.out.println("Desafiante");
            this.desafiante.apresentar(); // Apresentando o desafiante

            Random aleatorio = new Random(); // Criando resultado aleatório 
            int vencedor = aleatorio.nextInt(3); // Vai gerar três resultados: 0,1,3
            switch(vencedor) {
                case 0: // Empate
                System.out.println(" Resultado: Luta Empatada");
                this.desafiado.empatarLuta(); // Informa o empate
                this.desafiante.empatarLuta();
                break;
                case 1: // Ganhou Desafiado
                System.out.println("Vencedor: " + desafiado.getNome());
                this.desafiado.ganharLuta(); // Informa quem venceu e perdeu a luta 
                this.desafiante.perderLuta();
                break;
                case 2: // Ganhou Desafiante 
                System.out.println("Vencedor: " + desafiante.getNome());
                this.desafiante.ganharLuta(); // Informa quem venceu e perdeu a luta
                this.desafiado.perderLuta();
                break;

            }

        } else {
            System.out.println("A luta não pode acontecer");
        } 

    }
    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
