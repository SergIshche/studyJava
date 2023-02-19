package day5;

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
}
