public class oops {
    class Employee{
        int employeeId;
        String name;
        double basicSalary;
        Employee(int employeeId,String name,double basicSalary){
            this.employeeId=employeeId;
            this.name=name;
            this.basicSalary=basicSalary;
        }
        double calculateSalary(){
            return basicSalary;
        }
        void displayDetails(){
            System.out.println("Employee ID:"+employeeId);
            System.out.println("Name:"+name);
            System.out.println("Basic Salary:"+basicSalary);
            System.out.println("Total Salary:"+calculateSalary());
        }
    }
    class FullTimeEmployee extends Employee{
        FullTimeEmployee(int employeeId,String name,double basicSalary){
            super(employeeId,name,basicSalary);
        }
        @Override 
        double calculateSalary(){
            return basicSalary*1.2;
        }
    }
    class PartTimeEmployee extends Employee{
        int hoursWorked;
        double hourlyRate;
        PartTimeEmployee(int employeeId,String name,double basicSalary,int hoursWorked,double hourlyRate){
            super(employeeId,name,basicSalary);
            this.hoursWorked=hoursWorked;
            this.hourlyRate=hourlyRate;
        }
        @Override 
        double calculateSalary(){
            return hoursWorked*hourlyRate;
        }
    }

        public static void main(String[] args){
            oops o=new oops();
            FullTimeEmployee fte=o.new FullTimeEmployee(1,"John",50000);
            PartTimeEmployee pte=o.new PartTimeEmployee(2,"Jane",0,20,200);
            System.out.println("Full Time Employee");
            fte.displayDetails();
            System.out.println("Part Time Employee");
            pte.displayDetails();
        }
    }
    

