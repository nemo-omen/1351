public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle(-5.0, 0);
        Rectangle rectThree = new Rectangle(3.5, 66.1);

        Rectangle[] rects = {rectOne, rectTwo, rectThree};

        for(int i = 0; i < rects.length; i++) {
            System.out.printf("Rectangle %d:%n", i + 1);

            System.out.println("A rectangle with width " + rects[i].getWidth() 
                                + " and height " + rects[i].getHeight()
                                + " has an area of " + rects[i].getArea()
                                + " and a perimeter of " + rects[i].getPerimeter() + "\n");
        }

        rectOne.setWidth(2.5);
        rectOne.setHeight(2.7);
        rectTwo.setWidth(5.1);
        rectTwo.setHeight(6.1);
        rectThree.setWidth(1.9);
        rectThree.setHeight(6.7);
        
        for(int i = 0; i < rects.length; i++) {
            System.out.printf("Rectangle %d:%n", i + 1);
    
            System.out.println("A rectangle with width " + rects[i].getWidth() 
                                + " and height " + rects[i].getHeight()
                                + " has an area of " + rects[i].getArea()
                                + " and a perimeter of " + rects[i].getPerimeter() + "\n");
        }
    }

}
