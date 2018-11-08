public class SignObserver extends Observer{
    public SignObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
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