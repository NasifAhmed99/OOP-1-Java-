public abstract class Shape
{
  protected double height;
  protected double width;

  public Shape ()
  {
    System.out.println (" Shape of You ");
  }
  public Shape (double height, double width)
  {
    this.height = height;
    this.width = width;
  }
  public void setHeight (double height)
  {
    this.height = height;
  }
  public void setWidth (double width)
  {
    this.width = width;
  }
  public double getHeight ()
  {
    return height;
  }
  public double getWidth ()
  {
    return width;
  }
  public abstract void draw();
  public abstract void calculateArea();
  public abstract void show();
}
