package pl.javastart.task;

public class Vehicle {
    private String name;
    private int tankCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, int tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    double totalDistanceTravel() {
        return (tankCapacity / averageFuelConsumption) * 100;
    }

     String getInfo() {
        return "Pojazd: " + name + ", pojemność baku: " + tankCapacity + ", średnie spalanie na 100km: " + averageFuelConsumption;
    }
}
