package org.example.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
//    static Scanner scanner = new Scanner(System.in);
//    static   int a=scanner.nextInt();
//   static int b=scanner.nextInt();
//     static   int sum(int a,int b){
//         if((a & b)>0 && (a &b )<200) {
//             return a + b;
//         }else {
//             return 0;
//         }
//    }
//   static int multiplication(int a,int b){
//         if((a & b)>0 && (a &b )<200) {
//             return a * b;
//         }else {
//             return 0;
//         }
//    }
//    public static void main(String[] args) {
//       int sum=  sum(a,b);
//      int mult=   multiplication(a,b);
//        System.out.println(sum);
//        System.out.println(mult);
//    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger a=in.nextBigInteger();
        BigInteger b=in.nextBigInteger();
    if (a.compareTo(BigInteger.ZERO)>0 && b.compareTo(BigInteger.ZERO)>0){
        BigInteger sum=a.add(b);
        BigInteger multiplication=a.multiply(b);
        System.out.println(sum);
        System.out.println(multiplication);
    }

}

}
