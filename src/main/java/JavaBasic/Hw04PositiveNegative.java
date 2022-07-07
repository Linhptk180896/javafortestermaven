package JavaBasic;

import java.util.Scanner;

public class Hw04PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check odd or even number
        if (a>=0){
            System.out.println(a +"  is a positive number");
        } else{
            System.out.println(a +"  is a negative  number");
        }


    }
}
