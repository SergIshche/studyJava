package day6;

public class Task3 {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Serhii", "Math");
        Student student = new Student("Oleh");

        teacher.mark(student);
    }
}
