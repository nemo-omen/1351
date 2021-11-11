public class Rectangle {
  private double width;
  private double height;

  Rectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }

  Rectangle(double width, double height) {
    this.setWidth(width);
    this.setHeight(height);
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
    if(width <= 0) {
      this.width = 1.0;
    } else {
      this.width = width;
    }
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
    if(height <= 0) {
      this.height = 1.0;
    } else {
      this.height = height;
    }
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
