package Conversion;

/**
 * Class to check sign of a subject
 * @author Sean McGovern
 * @version 1.0
 */
public class SignObserver extends Observer{
    public SignObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Method to print to console the Sign of the subject
     */
    @Override
    public void update() {
        String sign;

        if (subject.getState()>0){
            sign = "Positive";
        } else if (subject.getState()<0){
            sign = "Negative";
        } else {
            sign = "Zero";
        }
        System.out.println("Sign: " + sign);
    }
}