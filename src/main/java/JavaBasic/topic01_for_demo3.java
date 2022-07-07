package JavaBasic;

import java.util.Scanner;

public class topic01_for_demo3 {
    //static int aa =5;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //int nhap = sc.nextInt();
        int arr[] = new int[3];
        for(int i=0; i<arr.length; i++){
            System.out.println("Nhap phan tu so: "+i);
            arr[i] = sc.nextInt();
        }
        System.out.print(" Gia tri cua mang la: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
