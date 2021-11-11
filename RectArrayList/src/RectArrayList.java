import java.util.ArrayList;
import java.util.Scanner;

public class RectArrayList {
  public static void printRectArray(ArrayList<Rectangle> list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.println("Rectangle " + (i + 1) + ":");
      System.out.println("A rectangle with width " + list.get(i).getWidth() + " and height " + list.get(i).getHeight() + " has an area of " + list.get(i).getArea() + " and a perimeter of " + list.get(i).getPerimeter() + "\n");
      
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();

    double nextWidth = input.nextDouble();
    double nextHeight = input.nextDouble();

    while(nextWidth != 0 && nextHeight != 0) {
      int preAddSize = rectList.size();

      rectList.add(new Rectangle(nextWidth, nextHeight));

      int postAddSize = rectList.size();

      if(postAddSize > preAddSize) {
        System.out.println("Rectangle added.");
      }

      nextWidth = input.nextDouble();
      nextHeight = input.nextDouble();
    }

    input.close();

    printRectArray(rectList);

  }
}
