package Conversion;

/**
 * Class to check hexadecimal value of a subject
 * @author Sean McGovern
 * @version 1.0
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(
                subject.getState() ).toUpperCase() );
    }
}