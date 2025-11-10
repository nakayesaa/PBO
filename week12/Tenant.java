public class Tenant {
    private String name;
    private Vehicle rentedVehicle;

    public Tenant(String name, Vehicle rentedVehicle) {
        this.name = name;
        this.rentedVehicle = rentedVehicle;
    }

    public void displayRentalInfo() {
        System.out.println("Renter: " + name);
        rentedVehicle.displayInfo();
    }
}
