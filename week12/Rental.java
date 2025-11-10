import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Tenant> tenants = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public void displayAvailableVehicles() {
        System.out.println("=== Available Vehicles ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }

    public void displayTenants() {
        System.out.println("=== Renter List ===");
        for (Tenant t : tenants) {
            t.displayRentalInfo();
            System.out.println();
        }
    }
}
