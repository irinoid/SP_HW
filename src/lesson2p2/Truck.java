package lesson2p2;

public class Truck extends Transport {
    public Truck (String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre () {
        System.out.println("Меняем покрышку на тягаче");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель тягача");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

