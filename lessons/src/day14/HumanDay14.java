package day14;


public class HumanDay14 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HumanDay14(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HumanDay14{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}


