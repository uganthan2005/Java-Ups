import java.util.*;
public class Student {
    class Stud {

        String name;
        int age;
        String grade;
        int id;

        Stud(String name, int age, String grade, int id) {
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }  
        public String getGrade() {
            return grade;
        }
        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setGrade(String grade) {
            this.grade = grade;
        }
        public void setId(int id) {
            this.id = id;
        }


        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
            System.out.println("ID: " + id);
        }
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        Stud a= student.new Stud("John", 20, "A", 101);
        a.setName("Bob");
        String q=a.getName();
        System.out.println(q);

       
        System.out.println("Enter the no of students:");
        int n = sc.nextInt();
        Stud s[] = new Stud[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String grade = sc.next();
            int id = sc.nextInt();
            Stud stud = student.new Stud(name, age, grade, id);
            s[i] = stud;
        }

        for (int i = 0; i < n; i++) {
            s[i].display();
            System.out.println();
        }

        sc.close();
    }    
}
