package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(467);
        System.out.println("A tankolas ara: " + gasStation.tankCar(car,30));

        car.setKm(452);

        System.out.println("A fogyasztas: " + car.calculateConsumption());
    }
}
