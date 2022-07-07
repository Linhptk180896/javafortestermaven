package JavaBasic;


import java.util.Scanner;

public class topic01_for_demo4 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int inputNumber = scan.nextInt();

//        int[] number = {2, 3, 4, 5, 6, 7, 8};
        String weekDay = "Ngày làm việc";
        String haftWorkingday = "Nghỉ buổi chiều";
        String weekend = "Ngày nghỉ";
            switch (inputNumber) {
                case 2:
                    System.out.println("Hôm nay là thứ 2 - " + weekDay);
                    break;

                case 3:
                    System.out.println("Hôm nay là thứ 3 - " + weekDay);
                    break;

                case 4:
                    System.out.println("Hôm nay là thứ 4 - " + weekDay);
                    break;

                case 5:
                    System.out.println("Hôm nay là thứ 5 - " + weekDay);
                    break;

                case 6:
                    System.out.println("Hôm nay là thứ 6 - " + weekDay);
                    break;

                case 7:
                    System.out.println("Hôm nay là thứ 7 - " + haftWorkingday);
                    break;
                case 8:
                    System.out.println("Hôm nay là chủ nhật - " + weekend);
                    break;


                 default:
                System.out.println("Sai dữ liệu đầu vào");
            }

        }
        }


