package JavaBasic;

import java.util.Scanner;

public class Hw03OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check odd or even number
        if (a%2==0 && a!=0){
            System.out.println(a +"  is a even number");
        }else if (a==0){
            System.out.println(a +"  is not odd or even number");
        } else{
            System.out.println(a +"  is a odd number");
        }


    }
}
