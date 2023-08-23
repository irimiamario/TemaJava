import java.io.*;

class StudentRegister {
    public static void saveStudentsToFile(Student[] students, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(students);
            System.out.println("Students saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student[] loadStudentsFromFile(String filename) {
        Student[] students = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            students = (Student[]) inputStream.readObject();
            System.out.println("Students loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
