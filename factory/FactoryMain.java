package factory;

public class FactoryMain {

    public static void main(String... args) {
        CarFactory.buildCar(CarType.LUXERY);
        CarFactory.buildCar(CarType.SEDAN);
        CarFactory.buildCar(CarType.SMALL);
    }    
}
