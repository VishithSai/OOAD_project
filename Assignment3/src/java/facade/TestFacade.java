package facade;

public class TestFacade {
  public static void main(String[] args) {
    FacadeUser facade = new FacadeUser();
    facade.addCommentMember("Member comment", 1);
    facade.addCommentAdmin("Admin comment", 2);
    facade.createPostMember("Member post");
    facade.createPostAdmin("Admin post");
    facade.upvoteMember(1);
    facade.upvoteAdmin(2);
  }
}
