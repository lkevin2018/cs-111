/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Kevin Joseph
 * 		     kbj24
 *           kbj24@rutgers.edu
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		boolean result = false;
		int[] temp = new int[args.length];
		temp[0] = Integer.parseInt(args[0]);
		for(int i = 1; i < args.length; i++){
			int tempArg1 = Integer.parseInt(args[i]);
			for(int j = 0; j < i; j++){
				int tempArg2 = Integer.parseInt(args[j]);
				if(tempArg2 == tempArg1){
					result = true;
				}
			}
		}
		if(result){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
	}
}
