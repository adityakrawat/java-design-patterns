package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class ModelType {
        public static final String ALBUM = "album";
        public static final String MOVIE = "movie";
    }

    public static Map<String, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.MOVIE, new Movie());
    }
    
    public static PrototypeCapable getInstance(String s) throws CloneNotSupportedException {
        return prototypes.get(s).clone();
    }
}
