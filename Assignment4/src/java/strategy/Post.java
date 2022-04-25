public class Post {

    long id;
    String description;
    String community;
    long post_time;
    int likes;

    public Post(long post_time, int likes, String description, long id, String community) {
        this.post_time = post_time;
        this.likes = likes;
        this.description = description;
        this.id = id;
        this.community = community;
    }

    public long getPost_time() {
        return post_time;
    }

    public void setPost_time(long post_time) {
        this.post_time = post_time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        community = community;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + id +
                ", Description='" + description + '\'' +
                ", Community='" + community + '\'' +
                ", Post Time=" + post_time +
                ", Likes=" + likes +
                '}';
    }
}
