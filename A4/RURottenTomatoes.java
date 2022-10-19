/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Kevin Joseph
 * 		     kbj24
 *           kbj24@rutgers.edu
 * 
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		int [][] movieRating = new int [Integer.parseInt(args[0])] [Integer.parseInt(args[1])];
		int idx = 2;
		int [] sumRatings = new int[Integer.parseInt(args[1])];
		for(int r = 0; r < movieRating.length; r++){
			for(int c = 0; c < movieRating[0].length; c++){
				movieRating[r][c] = Integer.parseInt(args[idx]);
				idx++;
			}
		}
		for(int c = 0; c < movieRating[0].length; c++){
			int sum = 0;
			for(int r = 0; r < movieRating.length; r++){
				sum += movieRating[r][c];
			}
			sumRatings[c] = sum;
		}
		int result = -1;
		int tempMax = -1;
		for(int j = sumRatings.length - 1; j > -1; j--){
			if(sumRatings[j] >= tempMax){
				tempMax = sumRatings[j];
				result = j;
			}
		}
		System.out.print(result);
	}
}
