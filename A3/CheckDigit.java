/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Kevin Joseph
 *           kbj24
 *           kbj24@rutgers.edu
 * 
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long input = Long.parseLong(args[0]);
        String inputStr = String.valueOf(input);
        int lastCharIdx = inputStr.length() - 1;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < inputStr.length(); i++){
            String letter = inputStr.substring(lastCharIdx - i, lastCharIdx - i + 1);
            if(i % 2 == 0){
                sum1 += Integer.parseInt(letter);
            }
            else{
                sum2 += Integer.parseInt(letter);
            }
        }
        sum1 %= 10;
        sum2 %= 10;
        sum2 *= 3;
        sum2 %= 10;
        System.out.println((sum1+sum2)%10);
    }
}