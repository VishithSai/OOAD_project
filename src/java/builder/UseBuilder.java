package javacode;

public class UseBuilder {
        public static void main(String[] args){

            Community sports=new Community.CommunityBuilder(9L,"Sports").description("This is a sports community").numberOfPosts(0).build();
            System.out.println(sports);
            Community news=new Community.CommunityBuilder(10L,"News").numberOfPosts(100).build();
            System.out.println(news);
            Community tech=new Community.CommunityBuilder(11L,"Technology").description("Community focused on the Tech world").build();
            System.out.println(tech);
        }
}
