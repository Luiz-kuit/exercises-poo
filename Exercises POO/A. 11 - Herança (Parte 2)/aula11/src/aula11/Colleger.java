package aula11;

public class Colleger extends Student {
    private float scholarship; // Bolsa de estudo
    
    public void renewScholarship() {
        System.out.println("Renewing" + getName() + "Scholarship");
    }

    @Override // Sobrepondo o método utilizado na classe Student
    public void payMonthly() {
        System.out.println(this.getName() + " is a Scholarship! easy payment");
        System.out.println(toString());
        System.out.println("================================================================================================");
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
    
}
