package strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens=   s.split("[^A-Za-z]+");
        int tokenCount=0;
        for(String token :tokens){
            if(!token.isEmpty()){
                tokenCount++;
            }
        }
        System.out.println(tokenCount);
        for (String token:tokens){
            if (!token.isEmpty()){
            System.out.println(token);}
        }

        // Write your code here.
        scan.close();
    }
}
