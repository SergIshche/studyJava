package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        salary += 80;

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500){
            salary*=3;
        }
    }
}
