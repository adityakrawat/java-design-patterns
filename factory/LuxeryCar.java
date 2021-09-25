package factory;

public class LuxeryCar extends Car {

    LuxeryCar() {
        super(CarType.LUXERY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing luxery car...");
    }

    
    
}
