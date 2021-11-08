public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle(2.0, 30.0);
        Rectangle rectThree = new Rectangle(3.5, 66.1);

        Rectangle[] rects = {rectOne, rectTwo, rectThree};

        for(int i = 0; i < rects.length; i++) {
            System.out.printf("Rectangle %d:%n", i + 1);

            System.out.println("A rectangle with width " + rects[i].getWidth() 
                                + " and height " + rects[i].getHeight()
                                + " has an area of " + rects[i].getArea()
                                + " and a perimeter of " + rects[i].getPerimeter() + "\n");
            // System.out.printf("A rectangle with width %.1f and height %.1f has an area of %f and a perimeter of %f%n%n", 
            //                   rects[i].getWidth(), rects[i].getHeight(), rects[i].getArea(), rects[i].getPerimeter());
        }
    }
}
