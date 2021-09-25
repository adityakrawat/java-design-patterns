package observer;

public class MessagSaveObserver implements Observer {

    @Override
    public void update(ObservableORSubject observable, Object data) {
        System.out.println("Message to save: " + data);
        
    }
    
}
