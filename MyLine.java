public class MyLine {
    private MyPoint begin; // Represents the starting point of the line
    private MyPoint end; // Represents the ending point of the line

    // Constructor with individual x and y coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1); // Create a new MyPoint object for the beginning point
        this.end = new MyPoint(x2, y2); // Create a new MyPoint object for the ending point
    }

    // Constructor with MyPoint objects for the beginning and ending points
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter for the beginning point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for the beginning point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for the ending point
    public MyPoint getEnd() {
        return end;
    }

    // Setter for the ending point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter for the x coordinate of the beginning point
    public int getBeginX() {
        return begin.getX();
    }

    // Setter for the x coordinate of the beginning point
    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    // Getter for the y coordinate of the beginning point
    public int getBeginY() {
        return begin.getY();
    }

    // Setter for the y coordinate of the beginning point
    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    // Getter for the x coordinate of the ending point
    public int getEndX() {
        return end.getX();
    }

    // Setter for the x coordinate of the ending point
    public void setEndX(int x) {
        this.end.setX(x);
    }

    // Getter for the y coordinate of the ending point
    public int getEndY() {
        return end.getY();
    }

    // Setter for the y coordinate of the ending point
    public void setEndY(int y) {
        this.end.setY(y);
    }

    // Get the x and y coordinates of the beginning point as an array
    public int[] getBeginXY() {
        int[] beginXY = {begin.getX(), begin.getY()};
        return beginXY;
    }

    // Set the x and y coordinates of the beginning point
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Get the x and y coordinates of the ending point as an array
    public int[] getEndXY() {
        int[] endXY = {end.getX(), end.getY()};
        return endXY;
    }

    // Set the x and y coordinates of the ending point
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Calculate and return the length of the line using the distance method of MyPoint
    public double getLength() {
        return begin.distance(end);
    }

    // Calculate and return the gradient of the line using atan2 function
    public double getGradient() {
        double gradient = Math.atan2(getBeginY(), getBeginX());
        return gradient;
    }

    // Return a string representation of the line
    public String toString() {
        return("MyLine[begin=(" + getBeginX() + "," + getBeginY() + ")" + ",end=(" + getEndX() + "," + getEndY() + ")");
    }
}