package test1;
class student_system {
    class Student {
        String name;
        int rollNumber;
        int[] marks= new int[5];
        int totalMarks;
        double averageMarks; 
        char grade;

        public Student(String name, int rollNumber, int[] marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            for (int i = 0; i < 5; i++) {
                this.marks[i] = marks[i];
            }
            calculate();
        }
        public void calculate(){
            this.totalMarks=0;
            for (int i = 0; i < marks.length; i++) {
                this.totalMarks += marks[i];
            }
            this.averageMarks = (double) totalMarks / marks.length;
            if (averageMarks >= 90) {
                this.grade = 'A';
            } else if (averageMarks >= 80) {
                this.grade = 'B';
            } else if (averageMarks >= 70) {
                this.grade = 'C';
            } else if (averageMarks >= 60) {
                this.grade = 'D';
            } else {
                this.grade = 'F';
            }
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.print("Marks: ");
            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
            }
            System.out.println();
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade: " + grade);
        }
    }
    public static void main(String[] args){
        int[] marks1 = {85, 90, 78, 92, 88};
        int[] marks2 = {75, 80, 70, 85, 90};
        int[] marks3 = {65, 73, 86, 55, 85};
        student_system ss = new student_system();
        Student[] studs = {ss.new Student("Alice", 1, marks1),ss.new Student("Bob", 2, marks2),ss.new Student("Charlie", 3, marks3)};
        for (int i = 0; i < studs.length; i++) {
            studs[i].display();
            System.out.println();
        }
        String Topper = studs[0].name;
        for (int i = 1; i < studs.length; i++) {
            if (studs[i].averageMarks > studs[0].averageMarks) {
                Topper = studs[i].name;
            }
        }
        System.out.println("The Topper:"+ Topper);

    } 

    
}
