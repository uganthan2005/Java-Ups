import java.io.*;
import java.util.*;


public class studentfile{
    public static void main(String[] args){
        try{
            studentrecord[] initial={
                new studentrecord(1,"John",85.5),
                new studentrecord(2,"Jane",90.0),
                new studentrecord(3,"Bob",78.0),
                new studentrecord(4,"Alice",92.5),
                new studentrecord(5,"Tom",88.0)
            };
            File file=new File(FILE_NAME);
            if(!file.exists()){
                for(studentrecord s:initial){
                    appendStudent(s);
                }
                System.out.println("Initial student records added to file.");
            }
            List<studentrecord> students=readStudents();
            System.out.println("Student Records from file:");
            studentrecord topper=null;
            for(studentrecord s:students){
                s.displayDetails();
                if(topper==null || s.marks>topper.marks){
                    topper=s;
                }
            }
            if(topper!=null){
                System.out.println("Topper:");
                topper.displayDetails();
            }
            appendStudent(new studentrecord(6,"Sam",95.0));
            System.out.println("New student record added.");
        }catch(IOException | NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }

}
    static final String FILE_NAME="students.txt";
    static void appendStudent(studentrecord student) throws IOException{
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME,true))){
            writer.write(student.id+","+student.name+","+student.marks);
            writer.newLine();
        }
    }
    static List<studentrecord> readStudents() throws IOException{
        List<studentrecord> students=new ArrayList<>();
        File file =new File(FILE_NAME);
        if(!file.exists()){
            return students;
        }
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!=null){
                String[] data=line.split(",",3);
                if(data.length==3){
                    int id=Integer.parseInt(data[0]);
                    String name=data[1];
                    double marks=Double.parseDouble(data[2]);
                    students.add(new studentrecord(id, name, marks));
                }
            }
        }
        return students;
    }
    
}
class studentrecord {
    int id;
    String name;
    double marks;
    studentrecord(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("Student ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
    
}