package aula11;

public class Student extends Person{
    private int matriculation; 
    private String course;
    
    public void payMonthly() {
        System.out.println("Paying student tuition " + this.getName());
        System.out.println(toString());  
    }
   
    public int getMatriculation() {
        return matriculation;
    }
    public void setMatriculation(int matriculation) {
        this.matriculation = matriculation;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    
}
