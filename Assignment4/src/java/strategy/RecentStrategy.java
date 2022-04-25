import java.util.Arrays;

public class RecentStrategy implements SearchResultStrategy{
    @Override
    public Post[] searchResult(Post[] posts) {
        Arrays.sort(posts,new RecentComparator());
        return posts;
    }
}
