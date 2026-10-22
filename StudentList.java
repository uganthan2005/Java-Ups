import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "CSE"));
        students.add(new Student("Bob", 21, "CIT"));
        students.add(new Student("Charlie", 22, "ECE"));

        for (Student student : students) {
            student.display();
        }
    }
}

class Student{
    String name;
    int age;
    String department;

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}



