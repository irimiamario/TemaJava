import java.util.Arrays;

public class TestClassMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Andrei", 70),
                new Student("Mario", 100),
                new Student("Costin", 80),
                new Student("Irimia", 80),
                new Student("Ana", 34),
                new Student("Mara", 67),
                new Student("Vlad", 44),
                new Student("Costel", 78)
        };

        String filename = "students.dat";

        StudentRegister.saveStudentsToFile(students, filename);

        Student[] loadedStudents = StudentRegister.loadStudentsFromFile(filename);

        if (loadedStudents != null) {
            System.out.println("Loaded students: " + Arrays.toString(loadedStudents));
        }
    }
}