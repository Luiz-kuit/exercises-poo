package aula11;

public abstract class Person { // Classe abstrata: Não pode ser instanciada, só pode servir como progenitora 
    // Atributos 
    private String name;
    private int age; // Idade
    private String gender; // Sexo, gênero
    // Métodos 
    public final void haveBirthday(int b) { // final: método não pode ser sobreposto
        b = 1;
        this.age+=b;
        System.out.println("Congratulations "+ getName() + " for your " + this.age + " years of life!");
        System.out.println("================================================================================================");
    }
    // Métodos Especiais
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }  
       
}
