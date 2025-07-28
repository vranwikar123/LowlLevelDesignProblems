package ObservableObserver.Subject;


import ObservableObserver.Observer.IObserver;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}
