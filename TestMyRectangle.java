public class TestMyRectangle {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Start of MyRectangle testing");
        System.out.println(" ");

        // Create a rectangle using MyPoint objects
        MyPoint topLeft = new MyPoint(1, 3);
        MyPoint bottomRight = new MyPoint(6, 1);
        MyRectangle rectangleOne = new MyRectangle(topLeft, bottomRight);

        // Test getTopLeft() and getBottomRight() methods
        System.out.println("Use the getTopLeft() for topLeft Rectangle coord, or getBottomRight() for bottom right coords");
        System.out.println("Rectangle: Top-left corner: " + rectangleOne.getTopLeft() + " ,Bottom-right corner: " + rectangleOne.getBottomRight());
        System.out.println();

        // Test getTopLeftX() and getTopLeftY() methods
        System.out.println("Getting topLeft coords using getTopLeftX() and getTopLeftY()");
        System.out.println("Rectangle:[Top-left x: " + rectangleOne.getTopLeftX() + " ,y: " + rectangleOne.getTopLeftY() +"]");
        System.out.println();

        // Test setTopLeftX() and setTopLeftY() methods
        System.out.println("Updating topleft coords using setTopLeftX() and setTopLeftY()");
        rectangleOne.setTopLeftX(5);
        rectangleOne.setTopLeftY(7);
        System.out.println("Rectangle:[New Top-left x: " + rectangleOne.getTopLeftX() + " ,y: " + rectangleOne.getTopLeftY() +"]");
        System.out.println();

        // Test getBottomRightX() and getBottomRightY() methods
        System.out.println("Get the bottom right Rectangle coords using getBottomRightX() and getBottomRightY()");
        System.out.println("Rectangle:[Top-left x: " + rectangleOne.getBottomRightX() + " ,y: " + rectangleOne.getBottomRightY() +"]");
        System.out.println();

        // Test setBottomRightX() and setBottomRightY() methods
        System.out.println("Update bottom right coords using setBottomRightX() and setBottomRightY()");
        rectangleOne.setBottomRightX(8);
        rectangleOne.setBottomRightY(4);
        System.out.println("Rectangle:[New Top-left x: " + rectangleOne.getBottomRightX() + " ,y: " + rectangleOne.getBottomRightY() +"]");
        System.out.println();

        // Test getWidth() method
        System.out.println("Get width of rectangle using getWidth()");
        System.out.println("Rectangle width: " + rectangleOne.getWidth());
        System.out.println();

        // Test getHeight() method
        System.out.println("Get height of rectangle using getHeight()");
        System.out.println("Rectangle height: " + rectangleOne.getHeight());
        System.out.println();

        // Test getArea() method
        System.out.println("getArea of rectangle using getArea()");
        System.out.println("Rectangle area: " + rectangleOne.getArea());
        System.out.println();

        // Test getPerimeter() method
        System.out.println("getPerimeter of rectangle using getPerimeter()");
        System.out.println("Rectangle perimeter: " + rectangleOne.getPerimeter());
        System.out.println();

        // Test toString() method
        System.out.println("Print toString method");
        System.out.println(rectangleOne);

        System.out.println(" ");
        System.out.println("End of MyRectangle testing");
        System.out.println(" ");
    }
}