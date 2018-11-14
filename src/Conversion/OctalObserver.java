package Conversion;

/**
 * Class to check octal value of a subject
 * @author Sean McGovern
 * @version 1.0
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Prints octal value of subject to the console
     */
    @Override
    public void update() {
        System.out.println("Octal: " +
                Integer.toOctalString(subject.getState() ) );
    }
}