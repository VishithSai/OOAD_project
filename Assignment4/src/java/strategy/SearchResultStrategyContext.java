public class SearchResultStrategyContext {
    private SearchResultStrategy strategy;
    //String strategy_name;

    public SearchResultStrategyContext(SearchResultStrategy strategy) {
        this.strategy = strategy;
       // this.strategy_name=strategy_name;
    }

    public void setStrategy(SearchResultStrategy strategy) {
        this.strategy = strategy;
        //this.strategy_name=strategy_name;
    }

    public Post[] executeSearch(Post[] posts){
        return strategy.searchResult(posts);
    }
}
