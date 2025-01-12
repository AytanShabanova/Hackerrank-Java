package org.example.dataStructures;

import java.util.Scanner;

public class JavaSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr []=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int negativsubarr=0;
        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum=sum+arr[end];
                if(sum<0){
                    negativsubarr++;
                }
            }
        }
        System.out.println(negativsubarr);
        sc.close();
    }


}
