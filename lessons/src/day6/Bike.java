package day6;

public class Bike {

    private String model;
    private int year;
    private String color;


    public Bike(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }
    void print(){
        System.out.println(color + " " + model + " " + year + " year"  );
    }
    public void info() { System.out.println( "This is a bike" ); }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}
