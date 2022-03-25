package java;
 
public class TestFactoryPattern {
  public static void main(String[] args) {
    System.out.println(PostFactory.buildCar(CarType.Written_post));
    System.out.println(PostFactory.buildCar(CarType.Image_post));
    System.out.println(PostFactory.buildCar(CarType.Video_post));
    System.out.println(PostFactory.buildCar(CarType.GIF_post));
  }
}