package prototype;

import prototype.PrototypeFactory.ModelType;

public class PrototypeMain {

    public static void main(String... args) throws CloneNotSupportedException {
        Object moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE);
        System.out.println("moviePrototype instanceof Movie: "+ (moviePrototype instanceof Movie));

        Object albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM);
        System.out.println("albumPrototype instanceof Album: "+ (albumPrototype instanceof Album));
    }
    
}
