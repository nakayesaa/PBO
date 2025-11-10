public class Motor extends Vehicle {

    private int numberOfWheels;

    public Motor(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Motorcycle: " +
                brand +
                " " +
                model +
                ", Year: " +
                year +
                ", Wheels: " +
                numberOfWheels
        );
    }
}
