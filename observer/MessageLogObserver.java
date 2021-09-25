package observer;

public class MessageLogObserver implements Observer{

    @Override
    public void update(ObservableORSubject observable, Object data) {
        System.out.println("Message to log: " + data);
        
    }
    
}
