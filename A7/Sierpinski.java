/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Kevin Joseph
 *           kbj24
 *           kbj24@rutgers.edu
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        return ((Math.sqrt(3)*length)/2);
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double[] verticesX = {x, x + (length)/2.0, x - (length)/2.0};
        double[] verticesY = {y, y + height(length), y + height(length)};
        StdDraw.filledPolygon(verticesX, verticesY);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        if(n == 0){
            return;
        }
        else{
            filledTriangle(x, y, length);
            sierpinski(n-1, x - (length/2.0), y, length/2.0);
            sierpinski(n-1, x, y + height(length), length/2.0);
            sierpinski(n-1, x + (length/2.0), y, length/2.0);
        }

    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] verticesX = {0.0, 1.0, 0.5};
        double[] verticesY = {0.0, 0.0, height(1)};
        StdDraw.polygon(verticesX, verticesY);
        sierpinski(n, 0.5, 0, 0.5);
    }
}
