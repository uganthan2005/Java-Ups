import java.util.*;
public class studentmanagement {
    static class Student{
        int studentId;
        String name;
        double marks;
        Student(int studentId,String name,double marks){
            this.studentId=studentId;
            this.name=name;
            this.marks=marks;
        }
        void displayDetails(){
            System.out.println("Student ID:"+studentId);
            System.out.println("Name:"+name);
            System.out.println("Marks:"+marks);
        }
    }
    static ArrayList<Student> students=new ArrayList<>();
    static Student searchStudent(int studentId){
        for(Student s:students){
            if(s.studentId==studentId){
                return s;
            }
        }
        return null;
    }
    static void displayAll(){
        for(Student s:students){
            s.displayDetails();
        }
    }
    public static void main(String[] args){
        students.add(new Student(1,"John",85.5));
        students.add(new Student(2,"Jane",90.0));
        students.add(new Student(3,"Bob",78.0));
        students.add(new Student(4,"Alice",92.5));
        students.add(new Student(5,"Tom",88.0));
        displayAll();
        System.out.println("Students scoring above 75:");
        for(Student s:students){
            if(s.marks>75){
                s.displayDetails();
            }
        }
        int searchId=3;
        Student found=searchStudent(searchId);
        if(found!=null){
            System.out.println("Student found:");
            found.displayDetails();
        }
        else{
            System.out.println("Student with ID "+searchId+" not found.");
        }
        Student update=searchStudent(2);
        if(update!=null){
            update.marks=80;
            System.out.println("Marks updated");
            update.displayDetails();
        }
        Student delete=searchStudent(4);
        if(delete!=null){
            students.remove(delete);
            System.out.println("Student with ID 4 deleted.");
        }
        else{
            System.out.println("Student with ID 4 not found.");
        }
        students.sort(Comparator.comparingDouble(s->s.marks));
        System.out.println("Students sorted by marks:");
        displayAll();

    }
    
    
}
