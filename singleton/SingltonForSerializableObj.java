package singleton;

import java.io.Serializable;

public class SingltonForSerializableObj implements Serializable {

    private static final long serialVersionUID = 1L;

    private static class SingletonInnerClass {
        public static final SingltonForSerializableObj instance = new SingltonForSerializableObj();
    }

    public static SingltonForSerializableObj getInstance() {
        return SingletonInnerClass.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
