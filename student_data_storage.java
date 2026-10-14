import java.io.*;

public class student_data_storage {
    private static final String FILE = "student_data.txt";

    public static void main(String[] args) {
        student_data_storage storage = new student_data_storage();
        storage.deletestudent(FILE);

    }

    void addstudent(String name, int age, String grade) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE, true))) {
            out.printf("\nName: %s\nAge: %d\nGrade: %s\n", name, age, grade);
            System.out.println("Student added.");
        } catch (Exception e) {
            System.out.println("Error saving student.");
        }
    }

    void displaystudent() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    void updatestudent(String name, int age, String grade) {
        modifyfile(name, "Name: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }

    void deletestudent(String name) {
        modifyfile(name, null); // passing null will remove the lines
    }

    // Helper method shared by update and delete to eliminate duplicate code
    private void modifyfile(String targetName, String replacementText) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("Name: " + targetName)) {
                    br.readLine(); br.readLine(); // Skip old age and grade lines
                    if (replacementText != null) content.append(replacementText).append("\n");
                } else {
                    content.append(line).append("\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file.");
            return;
        }

        try (FileWriter fw = new FileWriter(FILE)) {
            fw.write(content.toString().trim());
            System.out.println("File updated successfully.");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
