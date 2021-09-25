package factory;

public class SmallCar extends Car {
    
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing small car...");
    }    
}
