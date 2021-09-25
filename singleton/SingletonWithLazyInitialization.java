package singleton;

public class SingletonWithLazyInitialization {

    private static volatile SingletonWithLazyInitialization instance = null;

    private SingletonWithLazyInitialization() {}

    public static SingletonWithLazyInitialization getInstance() {
        if(instance == null) {
            synchronized(SingletonWithLazyInitialization.class) {
                if(instance == null) {
                    instance = new SingletonWithLazyInitialization();
                }
            }
        }

        return instance;
    }


}