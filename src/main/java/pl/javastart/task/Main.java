package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Car[] vehicles = new Car[4];
        vehicles[0] = new Car("BMW X5", 75, 12, false);
        vehicles[1] = new Car("Fiat Punto", 25, 5.5, false);
        vehicles[2] = new Truck("Citroen O3", 190, 10, false, 1400);
        vehicles[3] = new Truck("Audi A5", 145, 10, false, 1100);

        VehiclesUtils.printVehicles(vehicles);

        System.out.println();
        System.out.println("Zasięg który może przejechać BMW X5 to: " + vehicles[0].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Fiat Punto to: " + vehicles[1].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Citroen O3 to: " + vehicles[2].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Audi A5 to: " + vehicles[3].totalDistanceTravel() + "km");
        System.out.println();

        vehicles[0].setAirConditioning(true);
        vehicles[1].setAirConditioning(true);
        vehicles[2].setAirConditioning(true);
        vehicles[3].setAirConditioning(true);

        VehiclesUtils.printVehicles(vehicles);
        System.out.println();
        System.out.println("Zasięg który może przejechać BMW X5 to: " + vehicles[0].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Fiat Punto to: " + vehicles[1].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Citroen O3 to: " + vehicles[2].totalDistanceTravel() + "km");
        System.out.println("Zasięg który może przejechać Audi A5 to: " + vehicles[3].totalDistanceTravel() + "km");
    }
}
