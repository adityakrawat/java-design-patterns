package factory;

public abstract class Car {
    
    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarTpye(CarType carType) {
        this.carType = carType;    
    }
}
