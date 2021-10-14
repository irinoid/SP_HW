package lesson2p2;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre () {
        System.out.println("Меняем покрышку на машине");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

}
