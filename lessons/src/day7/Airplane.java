package day7;

public class Airplane {
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Producer: " + producer + ", year: " + year +
                ", lenght:" + lenght + ", weight:" + weight + ", fuel in the tank: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static void compareLenghtAirplane(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLenght() > airplane2.getLenght()) {
            System.out.println("First plane have "+airplane1.getLenght());
        } else if (airplane1.getLenght() < airplane2.getLenght()) {
            System.out.println("Second plane have "+airplane2.getLenght());
        } else {
            System.out.println("The same lenght");
        }


    }
}
