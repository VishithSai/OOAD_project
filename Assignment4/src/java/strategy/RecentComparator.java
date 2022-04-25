import java.util.Comparator;

public class RecentComparator implements Comparator<Post> {
    @Override
    public int compare(Post o1, Post o2) {
        return Integer.valueOf((int) o1.getPost_time()).compareTo(Integer.valueOf((int) o2.getPost_time()));
    }
}
