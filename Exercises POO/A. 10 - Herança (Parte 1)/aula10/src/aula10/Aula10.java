package aula10;

public class Aula10 {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Thyago");
        p2.setNome("Camila");
        p3.setNome("Fellype");
        p4.setNome("Fernando");

        p2.setCurso("Pedagogia");
        p3.setSalario(4200.25f);
        p4.setSetor("Recepção");

        p1.setIdade(31);
        p1.setSexo("M");

        System.out.println(p1.apresentar());

        p3.receberAumento(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatr();

        


    }
}
