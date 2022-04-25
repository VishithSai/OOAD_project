package observer;

public class Main 
{
  public static void main(String[] args) 
  {
    UserOne u1 = new UserOne();
    UserTwo u2 = new UserTwo();
    UserThree u3 = new UserThree();
    Notifier p = new Notifier();

    System.out.println("Add UserOne and UserTwo to subscribers list\n");
     
    p.attach(u1);
    p.attach(u2);
     
    p.notifyUpdate(new Message("First notification sent"));

    System.out.println("\nRemove UserOne from subscribers list");
    System.out.println("Add UserThree to subscribers list\n");
     
    p.detach(u1);
    p.attach(u3);
     
    p.notifyUpdate(new Message("Second notification sent"));
  }
}
