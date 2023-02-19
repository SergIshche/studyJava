package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setColor("Green");
        car1.setYear(2009);
        car1.print();

        Bike bike1 = new Bike("Honda", 2015, "Red");
        bike1.print();

    }
}



