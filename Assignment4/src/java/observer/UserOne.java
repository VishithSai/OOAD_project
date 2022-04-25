package observer;

public class UserOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("UserOne --> " + m.getMessage());
    }
}
