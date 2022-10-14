/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Kevin Joseph
 *           kbj24
 *           kbj24@rutgers.edu
 * 
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int posX = 0;
        int posY = 0;
        double result;
        System.out.println("(" + posX + ", " + posY + ")");
        for(int i = 0; i < n; i++){
            boolean isPositive = ((int)(Math.random()*2) == 1);
            boolean isX = ((int)(Math.random()*2) == 0);
            if(isPositive){
                if(isX){
                    posX += 1;
                }
                else{
                    posY += 1;
                }
            }
            else{
                if(isX){
                    posX -= 1;
                }
                else{
                    posY -= 1;
                }
            }
            System.out.println("(" + posX + ", " + posY + ")");
        }
        result = Math.pow(posX, 2) + Math.pow(posY, 2);
        System.out.println("Squared distance = " + result);
    }
}
