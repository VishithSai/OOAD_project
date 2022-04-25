package observer;

public class Message 
{
    final String content;
     
    public Message (String s) {
        this.content = s;
    }
 
    public String getMessage() {
        return content;
    }
}
