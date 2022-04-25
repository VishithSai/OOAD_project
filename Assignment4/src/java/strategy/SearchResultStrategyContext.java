public class SearchResultStrategyContext {
    private SearchResultStrategy strategy;

    public SearchResultStrategyContext(SearchResultStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchResultStrategy strategy) {
        this.strategy = strategy;
    }

    public Post[] executeSearch(Post[] posts){
        return strategy.searchResult(posts);
    }
}
