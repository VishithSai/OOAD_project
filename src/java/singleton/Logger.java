package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
  private static Logger logger = null;
  private final String logFile = "log.txt";
  private PrintWriter writer;

  private Logger() {
    try {
      FileWriter fw = new FileWriter(logFile);
      writer = new PrintWriter(fw, true);
    } catch (IOException e) {}
  }

  public static Logger getInstance(){
    if(logger == null){
      logger = new Logger();
    }
    return logger;
  }

  public void logUserCreation(String username){
    writer.println("Created user: " + username);
  }

  public void logUserDeletion(Integer userID){
    writer.println("Deleted user with userID: " + userID);
  }

  public void logPostCreation(Integer postID){
    writer.println("Created Post with postID: " + postID);
  }

  public void logPostDeletion(Integer postID){
    writer.println("Deleted Post with postID: " + postID);
  }

  public void logCommentCreation(Integer commentID, Integer postID){
    writer.println("Created comment with commentID " + commentID + " for postID " + postID );
  }

  public void logCommentDeletion(Integer commentID){
    writer.println("Deleted comment with commentID " + commentID );
  }
}
