public class Main {

    public static void main(String[] args) {
        Rental rental = new Rental();

        rental.addVehicle(new Car("Toyota", "Avanza", 2020, 4));
        rental.addVehicle(new Motor("Honda", "Beat", 2019, 2));
        rental.addVehicle(new Bike("Polygon", "Xtrada", 2021, "BMX"));

        rental.displayAvailableVehicles();

        Tenant t1 = new Tenant("Andi", new Car("Toyota", "Avanza", 2020, 4));
        Tenant t2 = new Tenant("Budi", new Motor("Honda", "Beat", 2019, 2));
        rental.addTenant(t1);
        rental.addTenant(t2);

        rental.displayTenants();
    }
}
