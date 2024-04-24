package observer.subiect;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }
    public void abonareObservers(Observer observer){
        this.observers.add(observer);
    }
    public void dezabonareObservers(Observer observer){
        this.observers.remove(observer);
    }
    protected void notificareObservers(String mesaj){
        for(Observer observer : this.observers){
            observer.primesteMesaj(mesaj);
        }
    }
    public abstract void anuntaPlecare();
}
