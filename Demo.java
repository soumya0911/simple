import java.time.LocalDate;

class Student {
    String name;
    int age;
    LocalDate DOB;

    Student(String name, int age, LocalDate DOB){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student DOB: " + DOB);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Soumya", 20, LocalDate.of(2005, 2, 7));
        s1.display();
    }
}
