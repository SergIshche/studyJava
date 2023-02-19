package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setColor("Green");
        car1.setYear(2009);
        car1.print();
        car1.info();
        System.out.println(car1.yearDifference(2023) + " years old");

        Bike bike1 = new Bike("Honda", 2015, "Red");
        bike1.print();
        bike1.info();


        System.out.println(bike1.yearDifference(2023));
    }
}