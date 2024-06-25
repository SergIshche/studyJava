package day12.task4;

import java.util.List;

/*Выполнять в подпапке task4 в day12 *
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
группу можно было добавлять и удалять участников. Под участником понимается
строка ( String ) с именем и фамилией. Реализовать статический метод слияния групп
(в классе MusicBand ), т.е. все участники группы А переходят в группу B . Название
метода: transferMembers . Этот метод принимает в качестве аргументов два
экземпляра класса MusicBand . Реализовать метод printMembers (в классе
MusicBand ), выводящий список участников в консоль. Проверить состав групп после
слияния.*/
public class MusicBand {
    private String name;
    private List<String> pib;
    private int year;

    public List<String> getPib() {
        return pib;
    }

    public void setPib(List<String> pib) {
        this.pib = pib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MusicBand(String name, int year, List<String> pib) {
        this.name = name;
        this.year = year;
        this.pib = pib;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String pib: a.getPib()){
            b.getPib().add(pib);

        }
        a.getPib().clear();
    }

    public void printMembers(){
        System.out.println(this.pib);
    }
    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", pib='" + pib + '\'' +
                ", year=" + year +
                '}';
    }
}