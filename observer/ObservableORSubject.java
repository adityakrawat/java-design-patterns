package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableORSubject {

    private boolean changed = false;
    
    private List<Observer> observers = null;

    public ObservableORSubject() {
        observers = new ArrayList<>();
    }

    public synchronized void addObservers(Observer observer) {
        if(observer == null)
            throw new NullPointerException();
        if(!observers.contains(observer))
            observers.add(observer);
    }

    public void notifyObervers() {
        notifyObervers(null);
    }

    public void notifyObervers(Object data) {
        synchronized(this) {
            if(!changed)
                return;
            clearChanged();
        }

        for(Observer observer: observers) {
            observer.update(this, data);
        }
    }

    public synchronized void deleteObserves(){
        observers.clear();
    }

    public synchronized void setChanged() {
        changed = true;
    }

    public synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }
    
    public synchronized int countObservers() {
        return observers.size();
    }
}