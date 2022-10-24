/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Kevin Joseph
 *           kbj24@rutgers.edu
 *           kbj24
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] result = new double[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = array[i];
        }
        return result;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for(int i = 0; i < x.length; i++){
            x[i] *= alpha;
        }
        for(int j = 0; j < y.length; j++){
            y[j] *= alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i = 0; i < x.length; i++){
            x[i] += dx;
        }
        for(int j = 0; j < y.length; j++){
            y[j] += dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        double[] xo = copy(x);
        double[] yo = copy(y);
        double thetaR = java.lang.Math.toRadians(theta);
        for(int i = 0; i < x.length; i++){
            x[i] = (xo[i]*Math.cos(thetaR)) - (yo[i]*Math.sin(thetaR));
        }
        for(int j = 0; j < y.length; j++){
            y[j] = (yo[j]*Math.cos(thetaR)) + (xo[j]*Math.sin(thetaR));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
    }
}
