package factory;

public class SedanCar extends Car {
    
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing sedan car...");    
    }

}
