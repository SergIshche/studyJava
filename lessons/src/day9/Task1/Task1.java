package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Jack", "415");
        Teacher teacher = new Teacher("Vasya", "English");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printinfo();
        teacher.printinfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }

}
