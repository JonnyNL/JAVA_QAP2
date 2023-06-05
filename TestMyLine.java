public class TestMyLine {
    
    public static void main(String[] args) {

        //Start of Test my line
        System.out.println(" ");
        System.out.println("Start of test myLine");
        System.out.println(" ");
        
        //Create a line using my points
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(6,6);
        MyLine lineOne = new MyLine(begin, end);
        
        //Create a line using x and y points
        MyLine lineTwo = new MyLine(10, 10, 6, 6);

        // Test getBegin() and getEnd() methods
        System.out.println("Use getBegin() and getEnd() to view beginning and end points");
        System.out.println("LineOne:[Begin point: " + lineOne.getBegin() + ",End point: " + lineOne.getEnd() + "]");
        System.out.println("LineTwo:[Begin point: " + lineTwo.getBegin() + ",End point: " + lineTwo.getEnd() + "]");
        System.out.println();
        
        // Test getBeginX() and getBeginY() methods
        System.out.println("Use getBeginX() and getBeginY() to view begin coordinates");
        System.out.println("LineOne:[Begin x: " + lineOne.getBeginX() + " ,y: " + lineOne.getBeginY() + "]");
        System.out.println("LineTwo:[Begin x: " + lineTwo.getBeginX() + " ,y: " + lineTwo.getBeginY() + "]");
        System.out.println();
        
        // Test setBeginX() and setBeginY() methods
        System.out.println("Update begin x coord using setBeginX() and update y coord using setBeginY()");
        lineOne.setBeginX(10);
        lineOne.setBeginY(20);
        System.out.println("LineOne:[Begin x: " + lineOne.getBeginX() + " ,y: " + lineOne.getBeginY() + "]");
        lineTwo.setBeginX(3);
        lineTwo.setBeginY(3);
        System.out.println("LineTwo:[Begin x: " + lineTwo.getBeginX() + " ,y: " + lineTwo.getBeginY() + "]");
        System.out.println();
        
        // Test getEndX() and getEndY() methods
        System.out.println("Use getEndX() and getEndY() to get end coordinates");
        System.out.println("LineOne:[End x: " + lineOne.getEndX() + " ,y: " + lineOne.getEndY() + "]");
        System.out.println("LineTwo:[End x: " + lineTwo.getEndX() + " ,y: " + lineTwo.getEndY() + "]");
        System.out.println();
        
        // Test setEndX() and setEndY() methods
        System.out.println("Update end coords using setEndY() and setEndX()");
        lineOne.setEndX(15);
        lineOne.setEndY(25);
        System.out.println("LineOne:[New End x: " + lineOne.getEndX() + " ,y: " + lineOne.getEndY() + "]");
        lineTwo.setEndX(9);
        lineTwo.setEndY(18);
        System.out.println("LineTwo:[New End x: " + lineTwo.getEndX() + " ,y: " + lineTwo.getEndY() + "]");
        System.out.println();
        
        // Test getBeginXY() method
        System.out.println("use getBeginXY() to get begin coords");
        int[] beginOneXY = lineOne.getBeginXY();
        System.out.println("LineOne:[Begin x: " + beginOneXY[0] + ",y: " + beginOneXY[1] + "]");
        int[] beginTwoXY = lineTwo.getBeginXY();
        System.out.println("LineTwo:[Begin x: " + beginTwoXY[0] + ",y: " + beginTwoXY[1] + "]");
        System.out.println();
        
        // Test setBeginXY() method
        System.out.println("Use setBeginXY to set the begin coords");
        lineOne.setBeginXY(12, 0);
        System.out.println("LineOne:[New Begin x: " + lineOne.getBeginX() + ",y" + lineOne.getBeginY() + "]");
        lineTwo.setBeginXY(2, 4);
        System.out.println("LineTwo:[New Begin x: " + lineTwo.getBeginX() + ",y" + lineTwo.getBeginY() + "]");
        System.out.println();
        
        // Test getEndXY() method
        System.out.println("Use getEndXY() to get ending coordinates");
        int[] endOneXY = lineOne.getEndXY();
        System.out.println("LineOne:[Begin x: " + endOneXY[0] + ",y: " + endOneXY[1] + "]");
        int[] endTwoXY = lineTwo.getEndXY();
        System.out.println("LineTwo:[Begin x: " + endTwoXY[0] + ",y: " + endTwoXY[1] + "]");
        System.out.println();
        
        // Test setEndXY() method
        System.out.println("Use setEndXY() to set ending coords");
        lineOne.setEndXY(6, 9);
        System.out.println("LineOne:[New End x: " + lineOne.getEndX() + ",y" + lineOne.getEndY() + "]");
        lineTwo.setEndXY(8, 5);
        System.out.println("LineTwo:[New End x: " + lineTwo.getEndX() + ",y" + lineTwo.getEndY() + "]");
        System.out.println();
        
        // Test getLength() method
        System.out.println("Use getLength() to get the length of a string");
        System.out.println("Line One length: " + lineOne.getLength());
        System.out.println("Line Two length: " + lineTwo.getLength());
        System.out.println();
        
        // Test getGradient() method
        System.out.println("Testing getGradient():");
        System.out.println("Line One gradient: " + lineOne.getGradient());
        System.out.println("Line Two gradient: " + lineTwo.getGradient());
        System.out.println();
        
        // Test toString() method
        System.out.println("Lines printed as toString");
        System.out.println("LineOne toString: " + lineOne);
        System.out.println("LineTwo toString: " + lineTwo);

        System.out.println(" ");
        System.out.println("End of Test MyLine");
        System.out.println(" ");
    }
}

