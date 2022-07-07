package JavaBasic;


import java.util.Scanner;

public class topic01_for_demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] animals = {"trau", "bo", "lơn", "ga"};
        for (int i=0; i<animals.length;i++){
            System.out.println("Input animal: " +i );
            animals[i] = scan.nextLine();
        }
        System.out.print(" Gia tri cua mang la: ");
        for (int i=0; i<animals.length;i++ ){
                String lastAnimal = animals[animals.length-1];
                System.out.print(animals[i] + "," +lastAnimal);


        }
    }
}


