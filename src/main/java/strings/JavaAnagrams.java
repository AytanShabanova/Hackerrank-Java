package strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
      if (a.length()!=b.length()){
          return false;
      }
      String s1=a.toLowerCase();
      String s2=b.toLowerCase();
      char[] c1=s1.toCharArray();
      char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
