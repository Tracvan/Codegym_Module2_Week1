import java.util.Objects;
import java.util.Scanner;

public class Student {
    String name;
    String classes;

    Student(String name, String classes) {
        this.name = "John";
        this.classes = "C02";
    }

    Scanner scanner = new Scanner(System.in);

    public void setName() {
        System.out.println("Input new name: ");
        String newName = scanner.nextLine();
        this.name = newName;
    }

    public void setClasses() {
        System.out.println("Input new class: ");
        String newClass = scanner.nextLine();
        this.classes = newClass;
    }
    public void display(){
        System.out.println("Student name: " + name + " Class: " + classes);
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Van", "C1123G1");
        s1.setName();
        s1.setClasses();
        s1.display();
    }
}


