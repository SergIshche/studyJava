package day6;

public class Car {
    private String model;
    private int year;
    private String color;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    void print(){
        System.out.println(color + " " + model + " " + year + " year"  );
    }
    public void info() {
        System.out.println("This is a car");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
