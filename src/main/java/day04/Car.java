package day04;

public class Car {
    private int fuelAmount;
    private int km;

    public double calculateConsumption(){
        return ((fuelAmount * 1.0) / km)*100;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
