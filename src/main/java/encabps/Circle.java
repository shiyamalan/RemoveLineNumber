package encabps;

public class Circle implements Shape
{

  
  public double radius;
  
  
  public Circle()
  {
    this(0.0);
  }
  
  public Circle(double radius)
  {
    this.radius = radius;
  }
  
  public void setRadius(double radius)
  {
    if(radius<0)
    {
      throw new IllegalArgumentException("Radius should be a positive number or digit");
    }
    
    this.radius = radius;
    
  }
  
  public double getRadius()
  {
    return radius;
  }
  public void draw()
  {
      System.out.println("Circle is drawn with the radius " + radius);
  }

  public double area()
  {
    
    return pi*radius*radius;
  }
  
  public double circumference()
  {
    // TODO Auto-generated method stub
    return Math.floor(2*pi*radius);
  }

}
