package facade;

public class Admin implements User {

   @Override
   public void addComment(String message, int postid) {
      System.out.println("Admin::AddComment -- " + message);
   }

   @Override
   public void createPost(String message) {
      System.out.println("Admin::CreatePost -- " + message);
   }

   @Override
   public void upvote(int postid) {
      System.out.println("Admin::Upvote -- " + postid);
   }
}
