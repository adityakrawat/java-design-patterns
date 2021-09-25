package observer;

public class MessageUIObserver implements Observer {

    @Override
    public void update(ObservableORSubject observable, Object data) {
        System.out.println("Message to show: " + data);
    }
    
}
