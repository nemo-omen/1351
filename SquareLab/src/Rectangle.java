public class Rectangle {
  private double width;
  private double height;

  Rectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * @return the width
   */
  public double getWidth() {
    return width;
  }

  /**
   * @param width the width to set
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * @return the height
   */
  public double getHeight() {
    return height;
  }

  /**
   * @param height the height to set
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * @return the area
   */
  public double getArea() {
    return this.width * this.height;
  }

  /**
   * @return the perimiter
   */
  public double getPerimeter() {
    return (this.width * 2) + (this.height * 2);
  }

}
