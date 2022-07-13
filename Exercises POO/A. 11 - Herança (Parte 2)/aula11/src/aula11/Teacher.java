package aula11;

public class Teacher extends Person{
    private String specialty;
    private float salary;

    public void receiveIncrease(float i) {
        this.salary += i;
        System.out.println("Teacher salary: " + this.getName() + ", became " + "R$" + this.getSalary() + ", after the increase");
        System.out.println("================================================================================================");      
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
