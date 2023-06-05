public class MyRectangle {
    private MyPoint topLeft; // Represents the top-left corner of the rectangle
    private MyPoint bottomRight; // Represents the bottom-right corner of the rectangle

    // Constructor with MyPoint objects for the top-left and bottom-right corners
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for the top-left corner
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Setter for the top-left corner
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter for the bottom-right corner
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter for the bottom-right corner
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Getter for the x coordinate of the top-left corner
    public int getTopLeftX() {
        return topLeft.getX();
    }

    // Setter for the x coordinate of the top-left corner
    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    // Getter for the y coordinate of the top-left corner
    public int getTopLeftY() {
        return topLeft.getY();
    }

    // Setter for the y coordinate of the top-left corner
    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    // Get the x and y coordinates of the top-left corner as an array
    public int[] getTopLeftXY() {
        int[] coordinates = {topLeft.getX(), topLeft.getY()};
        return coordinates;
    }

    // Set the x and y coordinates of the top-left corner
    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    // Getter for the x coordinate of the bottom-right corner
    public int getBottomRightX() {
        return bottomRight.getX();
    }

    // Setter for the x coordinate of the bottom-right corner
    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    // Getter for the y coordinate of the bottom-right corner
    public int getBottomRightY() {
        return bottomRight.getY();
    }

    // Setter for the y coordinate of the bottom-right corner
    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    // Set the x and y coordinates of the bottom-right corner
    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    // Calculate and return the width of the rectangle
    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculate and return the height of the rectangle
    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculate and return the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight();
    }

    // Calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Return a string representation of the rectangle
    public String toString() {
        return("MyRectangle[topLeft=(" + getTopLeftX() + "," + getTopLeftY() + "), bottomRight=(" + getBottomRightX() + "," + getBottomRightY() + ")]");
    }
}