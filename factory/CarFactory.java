package factory;

public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch(model) {
            case LUXERY:
                car  = new LuxeryCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case SMALL:
                car = new SmallCar();
                break;
            default:
                break;
        } 

        return car;
    }
    
}
