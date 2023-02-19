package day6;

public class Task2 {
    public static void main(String[] args){
        Airplane airplane1 = new Airplane("ZAZ", 2005, 50, 30000);

        airplane1.setYear(2011);
        airplane1.setLenght(45);
        airplane1.fillUp(10000);
        airplane1.fillUp(5000);
        airplane1.info();
    }
}
