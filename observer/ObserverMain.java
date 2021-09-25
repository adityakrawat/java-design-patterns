package observer;

public class ObserverMain {
    public static void main(String... args) {
        MessageDataVO message = new MessageDataVO();
        message.addObservers(new MessageUIObserver());
        message.addObservers(new MessagSaveObserver());
        message.addObservers(new MessageLogObserver());

        message.setMessage("This is Observer test message");

    }
}
