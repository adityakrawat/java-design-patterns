package singleton;

public class SingletonUsingInnerClass {
    
    private SingletonUsingInnerClass(){}

    private static class SingletonInnerClass {
        private static final SingletonUsingInnerClass INSTANCE = new  SingletonUsingInnerClass();
    } 

    public static SingletonUsingInnerClass getInstance() {
        return SingletonInnerClass.INSTANCE;
    }

}
