package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("块计a");
        int a = scanner.nextInt();
        System.out.println("块计b");
        int b = scanner.nextInt();
        System.out.println("块计c");
        int c = scanner.nextInt();
        System.out.println("块计d");
        int d = scanner.nextInt();
        System.out.println("块计e");
        int e = scanner.nextInt();
        int arr[]={a,b,c,d,e};
        int min=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("程"+min);
    }
}