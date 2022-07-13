package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Camila");
        s1.setMatriculation(1111);
        s1.setCourse("Pedagogia");
        s1.setAge(33);
        s1.setGender("F");
        s1.payMonthly();
        s1.haveBirthday(33);
        
                
        Colleger c1 = new Colleger();
        c1.setMatriculation(1112);
        c1.setName("Thyago"); 
        c1.setScholarship(12.5f);
        c1.setAge(31);
        c1.setGender("M");
        c1.payMonthly();

        Teacher t1 = new Teacher();
        t1.setName("Oscar");
        t1.setSpecialty("English");
        t1.setSalary(2200.30f);
        t1.receiveIncrease(200.20f);

    }
}
