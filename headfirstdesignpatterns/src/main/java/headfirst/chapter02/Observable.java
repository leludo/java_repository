package headfirst.chapter02;

public interface Observable {

    public abstract void setChanged();

    public abstract boolean isChanged();

    public abstract void registerObserver(Observer<? extends Observable> observer);

    public abstract void unregisterObserver(Observer<? extends Observable> observer);

    public abstract void notifyObservers();

}
