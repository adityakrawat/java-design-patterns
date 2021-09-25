package decorator;

public class DecoratorMain {

    public static void main(String... args) {
        SupportPopupDecorator decorator = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(decorator.getFirstColumnData());    
    }
    
}
