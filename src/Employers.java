public class Employers {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    Employers(String fullName,
              String position,
              String email,
              String phoneNumber,
              float salary,
              int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
    void printInfo(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("e-mail " + email);
        System.out.println("Тел: " + phoneNumber);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }
}
