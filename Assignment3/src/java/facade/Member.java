package facade;

public class Member implements User {

   @Override
   public void addComment(String message, int postid) {
      System.out.println("Member::AddComment -- " + message);
   }

   @Override
   public void createPost(String message) {
      System.out.println("Member::CreatePost -- " + message);
   }

   @Override
   public void upvote(int postid) {
      System.out.println("Member::Upvote -- " + postid);
   }
}
