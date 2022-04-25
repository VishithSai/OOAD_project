import java.util.Comparator;

public class PopularityComparator implements Comparator<Post> {
    @Override
    public int compare(Post o1, Post o2) {
        return Integer.valueOf(o2.getLikes()).compareTo(Integer.valueOf(o1.getLikes()));
    }
}