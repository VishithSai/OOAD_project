package observer;

public class UserThree implements Observer 
{
  @Override
  public void update(Message m) {
    System.out.println("UserThree --> " + m.getMessage());
  }
}
