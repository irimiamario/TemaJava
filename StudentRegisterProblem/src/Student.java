import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n| Student: " +
                "Name= " + name +
                ", Grade= " + grade + " | ";
    }
}