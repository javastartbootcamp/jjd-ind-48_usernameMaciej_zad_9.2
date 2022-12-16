package pl.javastart.task;

public class VehiclesUtils {

    static void printVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
