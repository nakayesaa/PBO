public class Bike extends Vehicle {
    private String bikeType;

    public Bike(String brand, String model, int year, String bikeType) {
        super(brand, model, year);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike: " + brand + " " + model + ", Year: " + year + ", Type: " + bikeType);
    }
}
