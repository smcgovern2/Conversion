package Conversion;

/**
 * Class to check binary value of a subject
 * @author Sean McGovern
 * @version 1.0
 */

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Prints binary value of subject to console
     */
    @Override
    public void update() {
        System.out.println( "Binary String: " +
                Integer.toBinaryString( subject.getState()));
    }
}