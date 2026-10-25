
import java.io.*;
import java.util.*;



public class EmployeeRecordManager {

    static ArrayList<Employee> employees = new ArrayList<>();
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static HashSet<Integer> employeeIds = new HashSet<>();

    static final String FILE_NAME = "employees.txt";
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());

            if (employeeIds.contains(id)) {
                System.out.println("Employee ID already exists.");
                return;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter department: ");
            String dept = sc.nextLine().trim();

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine().trim());

            if (name.isEmpty() || dept.isEmpty() || salary < 0
                    || !Double.isFinite(salary)) {
                System.out.println("Invalid employee details.");
                return;
            }

            Employee e = new Employee(id, name, dept, salary);

            employees.add(e);
            employeeMap.put(id, e);
            employeeIds.add(id);

            System.out.println("Employee added successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
    }

    static void searchEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());

            Employee e = employeeMap.get(id);

            if (e != null) {
                System.out.println(e);
            } else {
                System.out.println("Employee not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }

    static void updateSalary() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());

            Employee e = employeeMap.get(id);

            if (e == null) {
                System.out.println("Employee not found.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(sc.nextLine().trim());

            if (salary < 0 || !Double.isFinite(salary)) {
                System.out.println("Invalid salary.");
                return;
            }

            e.salary = salary;
            System.out.println("Salary updated successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
    }

    static void deleteEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());

            Employee e = employeeMap.remove(id);

            if (e != null) {
                employees.remove(e);
                employeeIds.remove(id);
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }

    static void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    static void saveToFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(FILE_NAME))) {
            for (Employee e : employees) {
                writer.write(e.toFile());
                writer.newLine();
            }
        }

        System.out.println("Records saved successfully.");
    }

    static void loadFromFile() throws IOException {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(
                new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",", 4);

                try {
                    if (data.length != 4) {
                        System.out.println("Skipping invalid record.");
                        continue;
                    }

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String dept = data[2];
                    double salary = Double.parseDouble(data[3]);

                    if (id <= 0 || name.trim().isEmpty()
                            || dept.trim().isEmpty()
                            || salary < 0 || !Double.isFinite(salary)
                            || employeeIds.contains(id)) {
                        System.out.println("Skipping invalid record.");
                        continue;
                    }

                    Employee e = new Employee(id, name, dept, salary);

                    employees.add(e);
                    employeeMap.put(id, e);
                    employeeIds.add(id);

                } catch (NumberFormatException ex) {
                    System.out.println("Skipping malformed record.");
                }
            }
        }

        System.out.println("Records loaded successfully.");
    }

    public static void main(String[] args) {
        try {
            loadFromFile();
        } catch (IOException e) {
            System.out.println("Could not load file: " + e.getMessage());
        }

        while (true) {
            System.out.println("\n--- Employee Record Manager ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All");
            System.out.println("6. Save and Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine().trim();

            switch(choice) {
                case "1":
                    addEmployee();
                    break;

                case "2":
                    searchEmployee();
                    break;

                case "3":
                    updateSalary();
                    break;

                case "4":
                    deleteEmployee();
                    break;

                case "5":
                    displayAll();
                    break;

                case "6":
                    try {
                        saveToFile();
                        sc.close();
                        return;
                    } catch (IOException e) {
                        System.out.println("Save failed: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name
                + ", Department: " + department
                + ", Salary: " + salary;
    }

    String toFile() {
        return id + "," + name + "," + department + "," + salary;
    }
}