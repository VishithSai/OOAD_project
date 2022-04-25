package observer;

public class UserTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("UserTwo --> " + m.getMessage());
    }
}
