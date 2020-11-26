public class MainClass {

    public static void main(String[] args)
    {
        TransportCompany transportCompany = new TransportCompany("...");
        transportCompany.printCollection();

        System.out.println("Number of cars from ... brand: " + transportCompany.carsByBrand("..."));

        Driver driverToAdd = new Driver("", "", "", 1234, "BMW"); //съответните данни
        transportCompany.addDriver(driverToAdd);
        transportCompany.printCollection();

        transportCompany.reverseOrder();
        transportCompany.printCollection();
    }
}