package usage;

import encabps.Circle;
import encabps.Shape;

public class MyCircle extends Circle
{
  
  
  
  public static void main(String[] args)
  {
    Circle circle = new MyCircle();
    circle.radius = -5;
    printProperties(circle);
  }
  
  static void printProperties(Shape shape)
  {
    System.out.println("Cicumstance is :- " + shape.circumference());
  }
}
