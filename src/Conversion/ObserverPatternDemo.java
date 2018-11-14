package Conversion;

/**
 * Runnable class of the conversion project
 * @author Sean McGovern
 * @version 1.0
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new SignObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);


        System.out.println("\nDetaching BinaryObserver...\n");
        subject.detach(2);

        System.out.println("Third state change: 0");
        subject.setState(0);

    }
}