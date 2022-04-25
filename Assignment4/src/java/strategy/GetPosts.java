public class GetPosts{
    public static void main(String[] args){
        Post post1= new Post(1350,100, "SRHvsCSK - SRH won the match",14522l, "Sports");
        Post post2= new Post(2200,99, "Elon Musk buys twitter shares",275324, "Business");
        Post post3= new Post(1100,120, "Red Hat pods vs Kubernetes",155624, "Software");

        Post[] posts=new Post[3];

        posts[0]=post1;
        posts[1]=post2;
        posts[2]=post3;

        SearchResultStrategyContext context = new SearchResultStrategyContext(new PopularityStrategy());

        context.executeSearch(posts);
        System.out.println("Popularity:");
        for(Post post:posts){
            System.out.println(post.toString());
        }
        context.setStrategy(new RecentStrategy());
        context.executeSearch(posts);
        System.out.println("Recent:");
        for(Post post:posts){
            System.out.println(post.toString());
        }
    }
}
