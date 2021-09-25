package observer;

public class MessageDataVO extends ObservableORSubject {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObervers(message);
    }
    
}
