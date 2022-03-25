
package java;

public class PostFactory {
  public static Post typepost(Post model) {
    Post post = null;
    switch (model) {
    case Written_post:
      post = new Written_post_post();
      break;

    case Image_post:
      post = new Image_post_post();
      break;

    case Video_post:
      post = new Video_post_post();
      break;

    case GIF_post:
      post = new GIF_post_post();
      break;

    default:
      break;
    }
    return post;
  }
}
