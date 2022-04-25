import java.util.Arrays;

public class PopularityStrategy implements SearchResultStrategy{

    @Override
    public Post[] searchResult(Post[] posts) {
        Arrays.sort(posts,new PopularityComparator());
        return posts;
    }
}
