package Conversion; /**
 * Class to provide data to observers
 * @author Sean McGovern
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    /**
     * Method to get the state
     * @return the subjects state
     */
    public int getState() {
        return state;
    }

    /**
     * Method to set state of subject and notify observers
     * @param state the desired state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * Attach a new observer to subject
     * @param observer observer to be attached
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     *Command all observers to update
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * method to remove an observer
     * @param index index of observer to detach
     */
    public void detach(int index){
        observers.remove(index);
    }
}

