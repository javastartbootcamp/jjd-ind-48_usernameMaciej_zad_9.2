package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, int tankCapacity, double averageFuelConsumption, boolean airConditioning) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    double totalDistanceTravel() {
        if (airConditioning == true) {
            return (getTankCapacity() / getAverageFuelConsumption()) * 100 - (0.8 * 100);
        } else {
            return super.totalDistanceTravel();
        }
    }

    boolean airConditionerOn() {
        if (airConditioning == false) {
            return airConditioning == true;
        }
        return airConditioning;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", czy klimatyzacja jest włączona: " + airConditioning;
    }
}
