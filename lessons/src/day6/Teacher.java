package day6;

import java.util.Random;

public class Teacher {
    private String pib;
    private String subject;

    public Teacher(String pib, String subject) {
        this.pib = pib;
        this.subject = subject;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void mark(Student student) {
        Random random = new Random();
        int generateMark = random.nextInt(4) + 2;

        String markWrite = "";
        switch (generateMark) {
            case 2:
                markWrite = "bad";
                break;
            case 3:
                markWrite = "not bad";
                break;
            case 4:
                markWrite = "good";
                break;
            case 5:
                markWrite = "excellent";
                break;
        }

        System.out.println("Teacher " + this.pib + " evaluate " + student.getPib() + " in "
                + this.subject + " " + markWrite );

    }
}
