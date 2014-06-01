package headfirst.chapter02;

public interface Observer<O extends Observable> {

    public void update(O observable);
}
