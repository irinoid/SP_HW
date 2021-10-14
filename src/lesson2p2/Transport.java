package lesson2p2;

public class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
}
