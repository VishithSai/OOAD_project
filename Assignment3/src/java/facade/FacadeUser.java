package facade;

public class FacadeUser {
  private User member;
  private User admin;

  public FacadeUser() {
    member = new Member();
    admin = new Admin();
  }

  public void addCommentMember(String message, int postid) {
    member.addComment(message, postid);
  }

  public void addCommentAdmin(String message, int postid) {
    admin.addComment(message, postid);
  }

  public void createPostMember(String message) {
    member.createPost(message);
  }

  public void createPostAdmin(String message) {
    admin.createPost(message);
  }

  public void upvoteMember(int postid) {
    member.upvote(postid);
  }

  public void upvoteAdmin(int postid) {
    admin.upvote(postid);
  }
}
