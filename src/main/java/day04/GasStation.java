package day04;

public class GasStation {
    private int fuelPrice;

    public GasStation(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public int tankCar(Car car, int liter){
        car.setFuelAmount(liter);
        return liter * fuelPrice;
    }
}
