package facade;

public interface User {
   void addComment(String message, int id);

   void createPost(String message);

   void upvote(int postid);
}
