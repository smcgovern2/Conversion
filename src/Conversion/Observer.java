package Conversion;

/**
 * Interface for observer objects
 * @author Sean McGovern
 * @version 1.0
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
