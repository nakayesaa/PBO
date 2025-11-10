public class Car extends Vehicle {
    private int numberOfWheels;

    public Car(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year + ", Wheels: " + numberOfWheels);
    }
}
