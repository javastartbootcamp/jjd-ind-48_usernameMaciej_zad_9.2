package pl.javastart.task;

public class Truck extends Car {
    private int loadWeight;

    public Truck(String name, int tankCapacity, double averageFuelConsumption, boolean airConditioning, int loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditioning);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    double totalDistanceTravel() {
        if (isAirConditioning() == true) {
            return getTankCapacity() / ((getAverageFuelConsumption()) + loadWeight / 100 * 0.5) * 100 - (1.6 * 100);
        } else {
            return getTankCapacity() / (getAverageFuelConsumption() + loadWeight / 100 * 0.5) * 100;
        }
    }

    @Override
    boolean airConditionerOn() {
        return super.airConditionerOn();
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", dostępna waga ładunku: " + loadWeight;
    }
}
