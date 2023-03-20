package day9.Task1;

public class Human {
    private String name;
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printinfo() {
        System.out.println("This human has name " + name);
    }



}
