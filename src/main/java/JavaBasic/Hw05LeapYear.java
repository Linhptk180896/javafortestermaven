package JavaBasic;

import java.util.Scanner;

public class Hw05LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //Check leap year
        if (a>0 && a%400 ==0){

        } else if (a<0){
            System.out.println(a +" is invalid number");
        }

        else{
            System.out.println(a +"  is not a leap year");
        }


    }
}
