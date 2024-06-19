package day12;

import java.util.ArrayList;
import java.util.List;

/*Создать список строк, добавить в него 5 марок автомобилей, вывести список в
консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
из списка. Распечатать список.*/
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Seat");
        list.add("ZAZ");
        list.add("KRAZ");
        list.add("LyAZ");

        System.out.println(list);

        list.set(2, "NewZAZ");
        list.add(3,"NewKRAZ");

        list.remove(0);

        System.out.println(list);

    }
}
