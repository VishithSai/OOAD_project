package singleton;

public class TestLogger {
  public static void main(String[] args) {
    Logger logger1 = Logger.getInstance();
    logger1.logUserCreation("Jackson");
    logger1.logPostCreation(1);
    logger1.logCommentCreation(1, 1);
    logger1.logCommentCreation(2, 1);

    logger1.logCommentDeletion(2);
    logger1.logCommentDeletion(1);
    logger1.logPostDeletion(1);
    logger1.logUserDeletion(1);
  }
}

