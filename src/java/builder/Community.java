package javacode;

public class Community {
    private final Long id;
    private final String name;
    private final String description;
    private final Integer numberOfPosts;

    private Community(CommunityBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.numberOfPosts = builder.numberOfPosts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
    public static class CommunityBuilder {
        private final Long id;
        private final String name;
        private String description;
        private Integer numberOfPosts;

        public CommunityBuilder(Long id, String name) {
            this.id = id;
            this.name = name;
        }
        public CommunityBuilder description(String description){
            this.description=description;
            return this;
        }
        public CommunityBuilder numberOfPosts(Integer numberOfPosts){
            this.numberOfPosts=numberOfPosts;
            return this;
        }
        public Community build() {
            Community community =  new Community(this);
            return community;
        }
    }
}


