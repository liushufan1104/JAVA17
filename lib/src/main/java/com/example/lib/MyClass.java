package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��J�Ʀra");
        int a = scanner.nextInt();
        System.out.println("��J�Ʀrb");
        int b = scanner.nextInt();
        System.out.println("��J�Ʀrc");
        int c = scanner.nextInt();
        System.out.println("��J�Ʀrd");
        int d = scanner.nextInt();
        System.out.println("��J�Ʀre");
        int e = scanner.nextInt();
        int arr[]={a,b,c,d,e};
        int min=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("�̤p�Ȭ�"+min);
    }
}